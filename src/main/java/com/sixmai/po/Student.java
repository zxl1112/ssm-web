package com.sixmai.po;

import java.text.DateFormat;
import java.util.Date;

public class Student {
    int student_id;
    String name;
    String sex;
    int age;
    Date birthday;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return("姓名："+name+" 性别："+sex+" 学号："+student_id+" 年龄："+age+" 出生年月："+ DateFormat.getDateInstance().format(birthday));
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}
