package org.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studentmanagement.model.Student;

@Component
public class StudentService
{
    private Student st;

    public StudentService(Student st)
    {
        this.st=st;
    }

    public void displayDetail()
    {
        System.out.println(st.getName()+st.getCourse());
    }
}
