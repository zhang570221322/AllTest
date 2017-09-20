package entity;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Blog {
    private Integer blogId;
    private String blogName;
    private Author blogAuthor;
    private HashSet<Article> blogArticles;

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", blogName='" + blogName + '\'' +
                '}';
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public Author getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(Author blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public HashSet<Article> getBlogArticles() {
        return blogArticles;
    }

    public void setBlogArticles(HashSet<Article> blogArticles) {
        this.blogArticles = blogArticles;
    }
}
