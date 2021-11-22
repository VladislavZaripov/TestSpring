package server.service;

import server.entity.Recipe;
import server.entity.Table1;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final Table1Service table1Service;
    private final Table2RowService table2RowService;
    private final Table3RowService table3RowService;

    public RecipeServiceImpl(Table1Service table1Service, Table2RowService table2RowService, Table3RowService table3RowService) {
        this.table1Service = table1Service;
        this.table2RowService = table2RowService;
        this.table3RowService = table3RowService;
    }

    @Override
    public void saveRecipe(Recipe recipe) {
        Integer id = table1Service.saveTable1(recipe.table1);

        recipe.rowsTable2.forEach(x->x.idRecipe = id);
        table2RowService.saveTable2Row(recipe.rowsTable2);

        recipe.rowsTable3.forEach(x->x.idRecipe = id);
        table3RowService.saveTable3Row(recipe.rowsTable3);
    }

    @Override
    public Recipe getRecipe(Integer id) {
        Optional<Table1> table1 = table1Service.findById(id);
        if(table1.isPresent())
            return new Recipe(
                    table1Service.findById(id).get(),
                    table2RowService.findByIdRecipe(id),
                    table3RowService.findByIdRecipe(id)
            );
        else
            return null;
    }
}