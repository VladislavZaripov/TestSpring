package server.controller;

import server.entity.Recipe;
import server.entity.RecipeFilter;
import server.service.ImageService;
import server.service.RecipeFilterService;
import server.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("ReciptizerServer")
public class AppRestController {

    private final RecipeService recipeService;
    private final RecipeFilterService recipeFilterService;
    private final ImageService imageService;

    public AppRestController(RecipeService recipeService, RecipeFilterService recipeFilterService,ImageService imageService) {
        this.recipeService = recipeService;
        this.recipeFilterService = recipeFilterService;
        this.imageService = imageService;
    }

    @GetMapping("getRecipe/{id}")
    public Recipe getRecipe(@PathVariable String id){
        return recipeService.getRecipe(Integer.parseInt(id));
    }

    @GetMapping("getFilter")
    public RecipeFilter getFilter(){
        return recipeFilterService.getRecipeFilter();
    }

    @GetMapping("getImage/{imageName}")
    public byte[] getImage(@PathVariable("imageName") String imageName){
        try {
            return imageService.loadImage(imageName);
        } catch (IOException e) {
            return null;
        }
    }

    @PostMapping ("postRecipe")
    public ResponseEntity postRecipe(@RequestBody Recipe recipe){
        recipeService.saveRecipe(recipe);
        return ResponseEntity.ok().build();
    }

    @PostMapping("postImage/{imageName}")
    public ResponseEntity postImage(@PathVariable("imageName") String imageName, HttpServletRequest request){
        try {
            imageService.saveImage(imageName,request);
            return ResponseEntity.ok().build();
        } catch (IOException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}