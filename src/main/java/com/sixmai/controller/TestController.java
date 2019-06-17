package com.sixmai.controller;


import com.sixmai.dao.StudentDao;
import com.sixmai.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller("testController")
public class TestController {
    @Autowired
    private StudentDao studentDao;
    public void example(){
       // String string="张三";
        int age1=21;
       Student student1=studentDao.selectStudentByAge(age1);
        int a=studentDao.countStudent();
        System.out.println(a);
        System.out.println(student1.getAge());
        //System.out.println(DateFormat.getDateInstance().format(student1.getBirthday()));
        //使用date format格式化date数据，使其成为1996-1-2格式
        Student student=new Student();
        student.setAge(25);
        Date date=new Date();
        SimpleDateFormat format= new SimpleDateFormat("yyyy年MM月dd");
        try {
            date=format.parse("1994年3月5号");
        }catch (Exception e){

        }
        student.setId(3);
        student.setBirthday(date);
        student.setName("云飞");
        student.setSex("女");
        student.setStudent_id(65);
        //studentDao.addStudent(student);
    }
}
