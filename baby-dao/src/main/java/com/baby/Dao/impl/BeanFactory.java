package com.baby.Dao.impl;

import com.baby.Dao.Do.StudentDo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by owner on 2017/4/14.
 */
public class BeanFactory {
    private org.springframework.beans.factory.BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");

    public List<Object> GetList(String beanName,String mapperFunction)
    {
        try {
            StudentImp test = (StudentImp)factory.getBean(beanName);
            return test.getSqlSession().selectList(mapperFunction);
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
}
