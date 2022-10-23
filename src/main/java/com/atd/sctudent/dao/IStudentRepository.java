package com.atd.sctudent.dao;

import com.atd.sctudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {

}
