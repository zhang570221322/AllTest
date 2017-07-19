package domain;

import dao.ArticleMapper;
import dao.AuthorMapper;
import dao.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public class BaseDomain {
    @Autowired
    protected ArticleMapper articleMapper;
    @Autowired
    protected AuthorMapper authorMapper;
    @Autowired
    protected BlogMapper blogMapper;
}
