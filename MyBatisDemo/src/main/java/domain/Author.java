package domain;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Author {
    private int author_id;
    private String author_name;
    private String author_age;
    private Blog author_blog;
    private HashSet<Article> author_articles;



    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_age() {
        return author_age;
    }

    public void setAuthor_age(String author_age) {
        this.author_age = author_age;
    }

    public Blog getAuthor_blog() {
        return author_blog;
    }

    public void setAuthor_blog(Blog author_blog) {
        this.author_blog = author_blog;
    }

    public HashSet<Article> getAuthor_articles() {
        return author_articles;
    }

    public void setAuthor_articles(HashSet<Article> author_articles) {
        this.author_articles = author_articles;
    }
}
