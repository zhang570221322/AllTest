package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zwl on 2017/7/31.
 * May god bless me
 */
@Controller
@RequestMapping("/query")
public class QueryAll {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(QueryAll.class);

    //映射一个action
    @RequestMapping(value = "/queryAll",method = {RequestMethod.GET,RequestMethod.POST})
    public String index(@RequestParam("id") String id, @RequestParam("type") String type, ModelMap model) {
        //输出日志文件
        logger.info("查询id = " + id + " 类型为" + type + "的数据");
        //返回一个index.jsp这个视图
        return "index";
    }

}
