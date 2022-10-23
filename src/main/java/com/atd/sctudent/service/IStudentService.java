package com.atd.sctudent.service;

import com.atd.sctudent.model.Student;

import java.util.List;

public interface IStudentService {
    void saveStudent(Student student);

    void updateStudent(Student student);

    List<Student> getAllStudents();

    String deleteStudentByID(int studentID);
}
