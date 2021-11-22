package server.repository;

import server.entity.Table3Row;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Table3RowRepository extends CrudRepository<Table3Row,Integer> {

    List<Table3Row> findTable3RowByIdRecipe (Integer idRecipe);
}