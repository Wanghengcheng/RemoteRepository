package com.baby.Dao.client;

import com.baby.Dao.Do.ArticleDo;
import com.baby.Dao.Do.StudentDo;

import java.util.List;

/**
 * Created by owner on 16-7-8.
 */
public interface IArticle {
   public List<ArticleDo> GetArticles(String creator);
   public int InsertArticle(ArticleDo articleDo);
}
