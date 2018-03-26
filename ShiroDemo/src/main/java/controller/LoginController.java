package controller;

import model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.AccountService;

/**
 * Created by zwl on 2017/9/20.
 * May god bless me
 */
@Controller
public class LoginController {
    // 处理用户业务类
    @Autowired
    private AccountService accountService;

    /***
     * 跳转到登录页面
     *
     * @return
     */
    @RequiresRoles({"admin","user"})
    @RequestMapping(value = "toLogin")
    public String toLogin() {

        // 跳转到/page/login.jsp页面
        return "login";
    }

    /***
     * 实现用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login")
    public ModelAndView Login(String username, String password) {

        ModelAndView mav = new ModelAndView();
        Subject currentUser=SecurityUtils.getSubject();
        if(!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            token.setRememberMe(true);
            try {
                currentUser.login(token);
            } catch (AuthenticationException e) {
                mav.setViewName("login");
                mav.addObject("msg", "errors");
                return mav;
            } finally {
                System.out.println("测试finally");
            }
        }
        mav.setViewName("redirect:/home");
        return mav;
    }


}
