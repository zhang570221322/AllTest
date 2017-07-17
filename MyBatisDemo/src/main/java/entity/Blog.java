package entity;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Blog {
     private  int  blog_id;
     private String blog_name;
     private Author blog_author;
     private HashSet<Article> blog_articles;



    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }

    public String getBlog_name() {
        return blog_name;
    }

    public void setBlog_name(String blog_name) {
        this.blog_name = blog_name;
    }

    public Author getBlog_author() {
        return blog_author;
    }

    public void setBlog_author(Author blog_author) {
        this.blog_author = blog_author;
    }

    public HashSet<Article> getBlog_articles() {
        return blog_articles;
    }

    public void setBlog_articles(HashSet<Article> blog_articles) {
        this.blog_articles = blog_articles;
    }
}
