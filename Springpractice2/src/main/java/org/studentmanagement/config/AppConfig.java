package org.studentmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.studentmanagement.model.Student;

@Configuration
@ComponentScan(basePackages = {"org.studentmanagement.model","org.studentmanagement.service"})
public class AppConfig
{
    @Bean
    public Student returnstudent()
    {
        return new Student(25,"sarthak","Java developer");
    }

}
