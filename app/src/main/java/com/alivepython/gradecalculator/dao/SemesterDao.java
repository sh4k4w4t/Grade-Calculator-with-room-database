package com.alivepython.gradecalculator.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.alivepython.gradecalculator.model.Semester;

import java.util.List;

@Dao
public interface SemesterDao {

    @Insert
    void InsertSemester(Semester semester);

    @Delete
    void DeleteSemester(Semester semester);

    @Update
    void UpdateSemester(Semester semester);

    @Query("select * from Semester Order by id ASC")
    List<Semester> GetAllSemester();

}
