package com.alivepython.gradecalculator;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.alivepython.gradecalculator.dao.CourseDao;
import com.alivepython.gradecalculator.dao.SemesterDao;
import com.alivepython.gradecalculator.model.Course;
import com.alivepython.gradecalculator.model.Semester;

@Database(entities = {Course.class, Semester.class},version = 1,exportSchema = false)
public abstract class GradeDatabase extends RoomDatabase {

    public abstract CourseDao courseDao();
    public abstract SemesterDao semesterDao();

    public static volatile GradeDatabase INSTANCE;

    static GradeDatabase getDatabase(final Context context){
        if(INSTANCE==null){
            INSTANCE=Room.databaseBuilder(context.getApplicationContext(), GradeDatabase.class, "GRADEDATABASE")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }


}
