/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Degree {
    private String name;
    private String code;
    private List<Course> courses;

    public Degree(String name, String code) {
        this.name = name;
        this.code = code;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> listCourses() {
        return courses;
    }
}
