package com.atd.sctudent.controller;

import com.atd.sctudent.impl.StudentServiceImpl;
import com.atd.sctudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentapp")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping(value = "/savestudent", method = RequestMethod.POST)
    @ResponseBody
    public Student saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);

        return student;
    }

    @RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
    @ResponseBody
    public Student updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);

        return student;
    }

    @RequestMapping(value = "/getallstudents", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/deletestudentbyid/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStudentByID(@PathVariable("id") int studentID) {
        return studentService.deleteStudentByID(studentID);
    }
}
