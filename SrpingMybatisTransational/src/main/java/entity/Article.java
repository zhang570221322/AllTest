package entity;

/**
 * Created by Administrator on 2017/7/15.
 */
public class Article {
    private Integer articleId;
    private String articleTitle;
    private String articleContent;
    private Author articleAuthor;
    private Blog articleBlog;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Author getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(Author articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Blog getArticleBlog() {
        return articleBlog;
    }

    public void setArticleBlog(Blog articleBlog) {
        this.articleBlog = articleBlog;
    }
}
