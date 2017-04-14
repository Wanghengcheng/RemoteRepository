package com.baby.Dao.impl;

import com.baby.Dao.Do.ArticleDo;
import com.baby.Dao.Do.StudentDo;
import com.baby.Dao.client.IArticle;
import com.baby.Dao.client.IStudent;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by owner on 16-7-8.
 */
public class ArticleImp extends SqlSessionDaoSupport implements IArticle {
    public List<ArticleDo> GetArticles(String creator)
    {
        try {
            BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
            ArticleImp test = (ArticleImp)factory.getBean("articleDao");
            return test.getSqlSession().selectList("com.baby.Dao.client.IArticle.GetArticles");
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

    public int InsertArticle(ArticleDo articleDo)
    {
        try {
            BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
            ArticleImp test = (ArticleImp)factory.getBean("articleDao");
            return test.getSqlSession().insert("com.baby.Dao.client.IArticle.InsertArticle",articleDo);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return 0;
    }
}
