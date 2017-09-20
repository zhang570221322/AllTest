package controller;

import model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
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
        User user = accountService.getUserByUserName(username);
        if (user == null) {
            mav.setViewName("Login");
            mav.addObject("msg", "用户不存在");
            return mav;
        }
        if (!user.getPassword().equals(password)) {
            mav.setViewName("Login");
            mav.addObject("msg", "账号密码错误");
            return mav;
        }
        SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
        // 登录后存放进shiro token
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        // 登录成功后会跳转到successUrl配置的链接，不用管下面返回的链接。
        mav.setViewName("redirect:/home");
        return mav;
    }


}
