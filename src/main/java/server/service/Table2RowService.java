package server.service;

import server.entity.Table2Row;

import java.util.List;

public interface Table2RowService {

    void saveTable2Row(List<Table2Row> table2Rows);

    List <Table2Row> findByIdRecipe(Integer idRecipe);
}