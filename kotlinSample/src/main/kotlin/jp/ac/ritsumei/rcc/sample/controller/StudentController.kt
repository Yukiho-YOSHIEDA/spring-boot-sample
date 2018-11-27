package jp.ac.ritsumei.rcc.sample.controller

import jp.ac.ritsumei.rcc.sample.model.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {

    @GetMapping
    fun getStudent(): Student {
        return Student(19810918, "george")
    }
}