package service.impl;

import domain.BlogDomian;
import entity.Article;
import entity.Author;
import entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.BlogService;

import java.util.List;

/**
 * Created by zwl on 2017/7/18.
 * May god bless me
 */
@Service
public class BlogServiceImpl implements BlogService {
     @Autowired
    private BlogDomian blogDomian;


    @Override
    public void saveBlogWithAuthorArticles(Author author , Blog blog , List<Article> articles) {
        blogDomian.insertBlogWithAuthorArticles(author,blog,articles);
    }

    @Override
    public void saveBlogWithAuthorArticlesTwo(Author author , Blog blog , List<Article> articles) {
        blogDomian.insertBlogWithAuthorArticles(author,blog,articles);
        int a=1/0;
        blogDomian.insertBlogWithAuthorArticles(author,blog,articles);
    }
}
