package com.baby.Dao.impl;

import com.baby.Dao.Do.StudentDo;
import com.baby.Dao.client.IStudent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.io.Reader;
import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by owner on 16-7-8.
 */
public class StudentImp extends SqlSessionDaoSupport implements IStudent {
    public List<StudentDo> GetStudents()
    {
        try {
            BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
            StudentImp test = (StudentImp)factory.getBean("studentDao");
            return test.getSqlSession().selectList("com.baby.Dao.client.IStudent.GetStudents");
            /*String resource = "mybatis/mybatis_base_sqlmap.xml";
            Reader reader = Resources.getResourceAsReader(resource);

            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(reader);

            SqlSession session = factory.openSession();
            IStudent student = (IStudent) session.getMapper(IStudent.class);
            return student.GetStudents(id);*/
        }
        catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return  null;
    }

    public int InsertStudent(StudentDo studentDo)
    {
        try {
            Set<Integer> setList = new HashSet<Integer>();
            HashMap
            ArrayList<Integer> aa = new ArrayList<Integer>();
            aa.stream().forEach((Integer item) -> {
                setList.add(item++);
            });
            BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
            StudentImp test = (StudentImp)factory.getBean("studentDao");
            return test.getSqlSession().insert("com.baby.Dao.client.IStudent.InsertStudent",studentDo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return 0;
    }
}
