package com.alivepython.gradecalculator.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Course {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String courseName;
    public double courseGpa;
    public double courseCredit;
    public int semesterId;

    public Course(int id, String courseName, double courseGpa, double courseCredit, int semesterId) {
        this.id = id;
        this.courseName = courseName;
        this.courseGpa = courseGpa;
        this.courseCredit = courseCredit;
        this.semesterId = semesterId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseGpa() {
        return courseGpa;
    }

    public void setCourseGpa(double courseGpa) {
        this.courseGpa = courseGpa;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }
}
