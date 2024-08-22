/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriculacion;

import java.util.Date;

/**
 *
 * @author User
 */
public class Enrollment {
    private Student student;
    private Course course;
    private Date date;
    private String status;
    private PaymentMethod paymentMethod;

    public Enrollment(Student student, Course course, Date date, String status) {
        this.student = student;
        this.course = course;
        this.date = date;
        this.status = status;
        this.paymentMethod = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean processPayment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        if (this.paymentMethod.processPayment()) {
            this.status = "Paid";
            return true;
        }
        return false;
    }

}
