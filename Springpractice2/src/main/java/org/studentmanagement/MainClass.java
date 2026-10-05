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

                                //        Student st = new Student(25, "Sarthak", "Java Developer");
                                //
                                //        StudentService student = new StudentService(st);
                                //        student.displayDetail();


                                    //in above code, you are manually injecting Student which is dependency of StudentService class.
        StudentService student=context.getBean(StudentService.class);
        student.displayDetail();
    }
}
