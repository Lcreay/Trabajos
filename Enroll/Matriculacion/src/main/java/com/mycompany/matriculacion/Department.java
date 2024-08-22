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
public class Department {
    private String name;
    private String code;
    private List<Professor> professors;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Department(String name, String code, List<Professor> professors, List<Course> courses) {
        this.name = name;
        this.code = code;
        this.professors = professors;
        this.courses = courses;
    }

   

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public List<Professor> listProfessors() {
        return professors;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> listCourses() {
        return courses;
    }
}
