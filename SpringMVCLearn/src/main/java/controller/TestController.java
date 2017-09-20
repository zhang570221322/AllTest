package controller;

import entity.Blog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



/**
 * Created by zwl on 2017/8/2.
 * May god bless me
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @RequestMapping("/test1")
    public String test1(){
      logger.info("this is test1");
        return "index";
    }
    @RequestMapping("/test2")
    public  String test2(Model model){
      model.addAttribute("message","hello  world");
        model.addAttribute("message2","hello  world2");
      return  "redirect:../index.jsp";
    }
    @RequestMapping("/test3")
    public  String test3(Model model, RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("test","test");
        redirectAttributes.addAttribute("test2","test2");
        return  "redirect:../index.jsp";
    }
    @RequestMapping("/test4")
    public  String test4(Model model, RedirectAttributes redirectAttributes){
        model.addAttribute("message","hello  world");
        model.addAttribute("message2","hello  world2");
        redirectAttributes.addAttribute("test","test");
        redirectAttributes.addAttribute("test3","test3");
        return  "redirect:../index.jsp";
    }
//    测试接收HttpServletRequest参数
    @RequestMapping("/test5")
    public  String test5(Model model, Blog blog){
        System.out.println(blog.getBlogId());
        System.out.println(blog.getBlogName());
        model.addAttribute("blog",blog);
        return  "query";
    }

}
