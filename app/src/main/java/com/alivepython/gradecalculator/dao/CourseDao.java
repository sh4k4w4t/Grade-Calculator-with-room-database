package com.alivepython.gradecalculator.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.alivepython.gradecalculator.model.Course;

import java.util.List;

@Dao
public interface CourseDao {

    @Insert
    void InsertCourse(Course course);

    @Delete
    void DeleteCourse(Course course);

    @Update
    void UpdateCourse(Course course);

    @Query("select * from  Course where semesterId Like :semesterID")
    List<Course> getCoursesBySemesterId(int semesterID);

    @Query("Delete from Course")
    void DeleteAllCourses();
}
