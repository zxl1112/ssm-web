package com.sixmai.dao;

import com.sixmai.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("studentDao")
@Mapper
public interface StudentDao {
    public Student selectStudentByAge(int age);
    public int addStudent(Student student);
    public int countStudent();
}
