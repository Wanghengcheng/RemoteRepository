package com.baby.service;

import com.baby.Dao.Do.ArticleDo;
import com.baby.Dao.Do.StudentDo;
import com.baby.Dao.client.IArticle;
import com.baby.Dao.client.IStudent;
import com.baby.Dao.impl.ArticleImp;
import com.baby.Dao.impl.StudentImp;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by owner on 16-4-10.
 */
@Service
public class ArticleService {
    private  IArticle articleImp = new ArticleImp();
    public  List<ArticleDo> GetArticles()throws Exception {

        return articleImp.GetArticles("hwang");
    }

    public int InsertArticle(ArticleDo articleDo)throws Exception {
        return articleImp.InsertArticle(articleDo);
    }
}
