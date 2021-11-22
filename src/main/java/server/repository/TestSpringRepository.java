package server.repository;

import org.springframework.data.repository.CrudRepository;
import server.entity.TestSpring;

public interface TestSpringRepository extends CrudRepository<TestSpring,Integer> {
}