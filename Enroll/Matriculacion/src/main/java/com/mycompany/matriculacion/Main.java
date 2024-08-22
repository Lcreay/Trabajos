/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriculacion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
            Degree degree = new Degree("Computer Engineering", "CE001");

       
        Course course1 = new Course("CS101", "Basic Programming", 3);
        Course course2 = new Course("CS102", "Data Structures", 3);
        
       
        degree.addCourse(course1);
        degree.addCourse(course2);

        
        Student student = new Student("John Doe", "12345", "john.doe@email.com", degree);

        
        Enrollment enrollment = student.enroll(course1);

       
        PaymentMethod paymentMethod = new PaymentMethod("Credit Card", "1234-5678-9012-3456", "John Doe", new Date(2025, 5, 31));

      
    }
}

