package com.baby.Dao.client;

import com.baby.Dao.Do.StudentDo;

import java.util.List;

/**
 * Created by owner on 16-7-8.
 */
public interface IStudent {
   public List<StudentDo> GetStudents();
   public int InsertStudent(StudentDo studentDo);
}
