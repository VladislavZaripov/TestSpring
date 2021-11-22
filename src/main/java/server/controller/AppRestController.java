package server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.entity.TestSpring;
import server.service.TestSpringService;

import java.util.List;

@RestController
@RequestMapping("TestSpring")
public class AppRestController {

    private final TestSpringService testSpringService;

    public AppRestController(TestSpringService testSpringService) {
        this.testSpringService = testSpringService;
    }

    // http://localhost:8080/TestSpring/get/2
    @GetMapping("get/{id}")
    public TestSpring getTestSpring(@PathVariable String id) {
        return testSpringService.findById(Integer.parseInt(id));
    }

    //http://localhost:8080/TestSpring/getAll/
    @GetMapping("getAll/")
    public List<TestSpring> getAll() {
        return testSpringService.getAll();
    }
}