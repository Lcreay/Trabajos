/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class Student {

    public Student(String john_Doe, String string, String johndoeemailcom, Degree degree) {
    }
    private String name;
    private String email;
    private int id;
    private String carrera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
     public Enrollment enroll(Course course) {
        Enrollment enrollment = new Enrollment(this, course, new Date(), "Pending");
        course.addStudent(this);
        return enrollment;
    }

    public List<Course> getCourses(com.mycompany.matriculacion.Degree degree) {
        if (degree != null) {
            return degree.listCourses();
        }
        return new ArrayList<>();
    }
}
