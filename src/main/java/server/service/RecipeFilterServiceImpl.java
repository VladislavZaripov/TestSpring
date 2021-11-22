package server.service;

import server.entity.RecipeFilter;
import org.springframework.stereotype.Service;

@Service
public class RecipeFilterServiceImpl implements RecipeFilterService {

    private final Table1Service table1Service;

    public RecipeFilterServiceImpl(Table1Service table1Service) {
        this.table1Service = table1Service;
    }

    @Override
    public RecipeFilter getRecipeFilter() {
        return new RecipeFilter(table1Service.getAll());
    }
}