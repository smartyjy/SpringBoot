//package com.example.controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.example.bean.Student;
//import com.example.repository.StudentRepository;
//
//@Controller
//public class StudentController {
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    @RequestMapping("/")
//    public String home() {
//        return "index";
//    }
//
//    @RequestMapping(value="/testdb")
//    public String testDataBase(Map<String, Object> model){
//        Long id = (long) 1;
//        Student stu = studentRepository.findStudentById(id);
//        model.put("student", stu);
//        return "testDataBase";
//    }
//}
