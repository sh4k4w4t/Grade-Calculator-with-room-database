package com.alivepython.gradecalculator.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class Semester {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String semesterName;
    public double semesterCredit;

    public Semester(String semesterName, double semesterCredit) {
        this.semesterName = semesterName;
        this.semesterCredit = semesterCredit;
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public double getSemesterCredit() {
        return semesterCredit;
    }

    public void setSemesterCredit(double semesterCredit) {
        this.semesterCredit = semesterCredit;
    }
}
