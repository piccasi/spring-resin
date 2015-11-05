package com.piccasi.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("come hello controller");
		System.out.println(req.getAttribute("name"));
		//1、收集参数、验证参数 //2、绑定参数到命令对象 //3、将命令对象传入业务对象进行业务处理 //4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		//添加模型数据 可以是任意的POJO对象 
		mv.addObject("message", "Hello World!");
		//设置逻辑视图名,视图解析器会根据该名字解析到具体的视图页面 
		mv.setViewName("other");
		
		return mv; 
	}
}