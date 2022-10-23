package com.atd.sctudent.dao;

import com.atd.sctudent.model.Student;

import java.util.List;

public interface IStudentDao {
    void saveStudent(Student student);

    void updateStudent(Student student);

    List<Student> getAllStudents();

    String deleteStudentByID(int studentID);
}
