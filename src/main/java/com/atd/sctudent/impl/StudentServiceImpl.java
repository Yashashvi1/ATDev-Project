package com.atd.sctudent.impl;
import com.atd.sctudent.service.IStudentService;
import com.atd.sctudent.dao.IStudentDao;
import com.atd.sctudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    @Override
    public void saveStudent(Student student) {
        student.setCreatedon(new Date());
        student.setUpdatedon(new Date());

        studentDao.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        student.setUpdatedon(new Date());
        studentDao.updateStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public String deleteStudentByID(int studentID) {
        return studentDao.deleteStudentByID(studentID);
    }
}
