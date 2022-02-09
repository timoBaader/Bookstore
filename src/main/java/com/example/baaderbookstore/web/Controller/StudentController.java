package com.example.baaderbookstore.web.Controller;

import com.example.baaderbookstore.web.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @RequestMapping("/list")
    public String listBooks(Model model){

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Timo", "baader"));
        studentList.add(new Student("Amal", "Suleiman"));
        studentList.add(new Student("Hans", "Hansen"));

        model.addAttribute(studentList);

        return "list.html";
    }
}
