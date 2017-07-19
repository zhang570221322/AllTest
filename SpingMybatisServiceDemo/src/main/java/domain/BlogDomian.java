package domain;

import entity.Article;
import entity.Author;
import entity.Blog;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
@Component
public class BlogDomian extends BaseDomain {

    public void insertBlogWithAuthorArticles(Author author , Blog blog , List<Article> articles) {
        blogMapper.insert(blog);
        author.setAuthorBlog(blog);
        authorMapper.insert(author);
        for (Article article : articles) {
            article.setArticleAuthor(author);
            article.setArticleBlog(blog);
            articleMapper.insert(article);
        }
    }
}
