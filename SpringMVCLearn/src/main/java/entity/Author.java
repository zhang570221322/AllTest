package entity;

import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Author {
    private Integer authorId;
    private String authorName;
    private String authorAge;
    private Blog authorBlog;
    private HashSet<Article> authorArticles;

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(String authorAge) {
        this.authorAge = authorAge;
    }

    public Blog getAuthorBlog() {
        return authorBlog;
    }

    public void setAuthorBlog(Blog authorBlog) {
        this.authorBlog = authorBlog;
    }

    public HashSet<Article> getAuthorArticles() {
        return authorArticles;
    }

    public void setAuthorArticles(HashSet<Article> authorArticles) {
        this.authorArticles = authorArticles;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorAge='" + authorAge + '\'' +
                '}';
    }
}
