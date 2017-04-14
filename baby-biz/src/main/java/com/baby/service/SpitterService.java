package com.baby.service;

import com.baby.Dao.Do.StudentDo;
import com.baby.Dao.client.IStudent;
import com.baby.Dao.impl.StudentImp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.Reader;
import java.util.List;
import redis.clients.jedis.*;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.SortingParams;

/**
 * Created by owner on 16-4-10.
 */
@Service
public class SpitterService {

    private static Jedis jedis = new Jedis("127.0.0.1", 6379);
    static
    {

    }
    public static List<StudentDo> getRecentSpitters()throws Exception {
        IStudent studentDao = new StudentImp();
//        getConnection();
        return studentDao.GetStudents();
    }

    public static int insertStudent(StudentDo studentDo)throws Exception {
        IStudent studentDao = new StudentImp();
//        String temp= jedis.get("hello");
        return studentDao.InsertStudent(studentDo);
    }

    public static String getConnection() {

        jedis.set("hello","aini");
        return  "";
    }
}
