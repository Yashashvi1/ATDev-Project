package com.atd.sctudent.impl;
import com.atd.sctudent.dao.IStudentDao;
import com.atd.sctudent.dao.IStudentRepository;
import com.atd.sctudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements IStudentDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> list = iStudentRepository.findAll(Sort.by(Sort.Direction.ASC, "updatedon"));
        return list;
    }

    @Override
    public String deleteStudentByID(int studentID) {
        Student student = entityManager.find(Student.class, studentID);
        if (student != null) {
            entityManager.remove(student);
            return "Student ID(" + studentID + ")successfully deleted";
        }
        return "Student Id is not found: " + studentID;
    }
}