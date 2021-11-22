package server.repository;

import server.entity.Table2Row;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Table2RowRepository extends CrudRepository<Table2Row,Integer> {

    List<Table2Row> findTable2RowByIdRecipe (Integer idRecipe);
}