package org.studentmanagement.model;

import org.springframework.stereotype.Component;

@Component
public class Student
{
    private String name;
    private short age;
    private String course;

    public Student()
    {

    }

    public Student(String name, short age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(short age)
    {
        this.age = age;
    }

    public void setCourse(String course)
    {
        this.course = course;
    }

    public String getName()
    {
        return name;
    }

    public short getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }

    public String getCourse()
    {
        return course;
    }
}
