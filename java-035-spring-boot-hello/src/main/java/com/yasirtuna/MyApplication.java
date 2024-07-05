package com.yasirtuna;

import com.yasirtuna.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
        System.out.println("Hello Spring Boot");

        Student student = new Student();
        student.setId(1);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("john@doe.com");
        System.out.println(student);

        Student Student1 = new Student(1,"YASİR","TUNA","yasir@tuna.com");
        System.out.println(Student1);

    }


}
