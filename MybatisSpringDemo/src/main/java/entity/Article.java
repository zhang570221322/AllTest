package entity;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Article {
    private int article_id;
    private String article_title ;
    private String article_content;
    private Author article_author;
    private Blog article_blog;

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public Author getArticle_author() {
        return article_author;
    }

    public void setArticle_author(Author article_author) {
        this.article_author = article_author;
    }

    public Blog getArticle_blog() {
        return article_blog;
    }

    public void setArticle_blog(Blog article_blog) {
        this.article_blog = article_blog;
    }


}
