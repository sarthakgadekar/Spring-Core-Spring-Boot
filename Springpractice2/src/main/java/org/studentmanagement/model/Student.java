package org.studentmanagement.model;

import org.springframework.stereotype.Component;


public class Student
{
    private int age;
    private String name;

    private String course;

    public Student(int age, String name, String course)
    {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getName()
    {
        return name;
    }

    public String getCourse()
    {
        return course;
    }
}
