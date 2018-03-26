package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("{to}")
	public String index(@PathVariable("to") String to) {
		System.out.println("登录成功");
		return to;
	}
}
