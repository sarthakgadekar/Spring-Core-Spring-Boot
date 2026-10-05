package org.studentmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studentmanagement.config.AppConfig;
import org.studentmanagement.model.Student;
import org.studentmanagement.service.StudentService;

public class MainClass
{
    public static void main(String[] args)
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service=context.getBean(StudentService.class);
        service.displayStudent();
    }
}
