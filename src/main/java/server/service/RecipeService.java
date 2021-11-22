package server.service;

import server.entity.Recipe;

public interface RecipeService {

    void saveRecipe(Recipe recipe);

    Recipe getRecipe(Integer id);
}