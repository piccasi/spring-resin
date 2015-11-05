package com.piccasi.mvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.piccasi.mvc.model.User;


@Controller
public class MyCommandController {
	private static final Log logger = LogFactory.getLog(MyCommandController.class);
	
	@RequestMapping(value = "/command.do")
	public ModelAndView handle(User user) {//自动绑定表单提交的数据，post方法必须用对象接收，get方法可以用基本类型接收也可以用对象接收
		logger.info("name: " + user.getName() + ",age: " + user.getAge());
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("other");
		mv.addObject("message", user.getName());
		return mv;
	}
} 
