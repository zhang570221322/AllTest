package service;

import entity.Article;
import entity.Author;
import entity.Blog;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public interface BlogService {

    void saveBlogWithAuthorArticles(Author author, Blog blog, List<Article> articles);


    void saveBlogWithAuthorArticlesTwo(Author author, Blog blog, List<Article> articles);
}
