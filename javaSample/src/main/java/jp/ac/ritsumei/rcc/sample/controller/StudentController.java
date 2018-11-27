package jp.ac.ritsumei.rcc.sample.controller;

import jp.ac.ritsumei.rcc.sample.exception.SampleException;
import jp.ac.ritsumei.rcc.sample.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public Student getStudent() {
        return new Student(19810918, "george");
    }

    @GetMapping("/exception")
    public Student exteption() throws SampleException {
        throw new SampleException("TestException");
    }
}
