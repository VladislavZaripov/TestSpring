package server.service;

import server.entity.Table1;
import server.repository.Table1Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Table1ServiceImpl implements Table1Service {

    private final Table1Repository table1Repository;

    public Table1ServiceImpl(Table1Repository table1Repository) {
        this.table1Repository = table1Repository;
    }

    @Override
    public Integer saveTable1(Table1 table1) {
         return this.table1Repository.save(table1).id;
    }

    @Override
    public Optional<Table1> findById(Integer id) {
        return this.table1Repository.findById(id);
    }

    @Override
    public List<Table1> getAll() {
        List<Table1> list = new ArrayList<>();
        table1Repository.findAll().forEach(list::add);
        return list;
    }
}