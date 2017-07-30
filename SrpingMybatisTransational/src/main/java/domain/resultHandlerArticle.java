package domain;

import entity.Article;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;

/**
 * Created by zwl on 2017/7/17.
 * May god bless me
 */
public class resultHandlerArticle  implements ResultHandler{

    @Override
    public void handleResult(ResultContext resultContext) {
        System.out.println("resultContext.getResultCount()===="+resultContext.getResultCount());
        Article article = (Article) resultContext.getResultObject();
        System.out.println(article.getArticleContent());
    }


}
