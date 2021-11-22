package server.service;

import server.entity.Table3Row;
import server.repository.Table3RowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Table3RowServiceImpl implements Table3RowService {

    private final Table3RowRepository table3RowRepository;

    public Table3RowServiceImpl(Table3RowRepository table3RowRepository) {
        this.table3RowRepository = table3RowRepository;
    }

    @Override
    public void saveTable3Row(List<Table3Row> table3Rows) {
        table3Rows.forEach(table3RowRepository::save);
    }

    @Override
    public List<Table3Row> findByIdRecipe(Integer idRecipe) {
        return table3RowRepository.findTable3RowByIdRecipe(idRecipe);
    }
}