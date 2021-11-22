package server.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    public Table1 table1;
    public List<Table2Row> rowsTable2;
    public List <Table3Row> rowsTable3;

}