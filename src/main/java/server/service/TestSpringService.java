package server.service;

import server.entity.TestSpring;

import java.util.List;

public interface TestSpringService {

    TestSpring findById(Integer id);

    List<TestSpring> getAll();
}