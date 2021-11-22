package server.service;

import server.entity.Table1;

import java.util.List;
import java.util.Optional;

public interface Table1Service {

    Integer saveTable1(Table1 table1);

    Optional<Table1> findById(Integer id);

    List<Table1> getAll();
}