package server.service;

import org.springframework.stereotype.Service;
import server.entity.TestSpring;
import server.repository.TestSpringRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestSpringServiceImpl implements TestSpringService {

    private final TestSpringRepository TestSpringRepository;

    public TestSpringServiceImpl(TestSpringRepository table1Repository) {
        this.TestSpringRepository = table1Repository;
    }

    @Override
    public TestSpring findById(Integer id) {
        return this.TestSpringRepository.findById(id).get();
    }

    @Override
    public List<TestSpring> getAll() {
        List<TestSpring> list = new ArrayList<>();
        TestSpringRepository.findAll().forEach(list::add);
        return list;
    }
}