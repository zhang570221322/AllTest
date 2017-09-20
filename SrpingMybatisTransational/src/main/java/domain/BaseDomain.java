package domain;

import dao.ArticleMapper;
import dao.AuthorMapper;
import dao.BlogMapper;

import javax.annotation.Resource;

/**
 * Created by zwl on 2017/7/19.
 * May god bless me
 */
public class BaseDomain {
    @Resource
    protected ArticleMapper articleMapper;
    @Resource
    protected AuthorMapper authorMapper;
    @Resource
    protected BlogMapper blogMapper;
}
