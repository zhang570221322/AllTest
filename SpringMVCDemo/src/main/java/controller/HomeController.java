package controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zwl on 2017/7/30.
 * May god bless me
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/home")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    //映射一个action
    @RequestMapping("/index")
    public  String index(){
        //输出日志文件
        logger.info("the first jsp pages");
        System.out.println("this is test");
        //返回一个index.jsp这个视图
        return "index";
    }
    //映射一个action

    @RequestMapping("/login")
    public @ResponseBody String login(@RequestParam String username,@RequestParam String password){
        //输出日志文件
        logger.info("the first jsp pages");
        System.out.println(username+"sssss"+password);
        //返回一个index.jsp这个视图
        return "loginOK";
    }
}