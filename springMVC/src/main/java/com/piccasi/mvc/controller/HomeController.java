package com.piccasi.mvc.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

import javax.print.attribute.standard.PageRanges;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.piccasi.mvc.beans.QueryParam;
import com.piccasi.mvc.model.User;
import com.piccasi.mvc.model.UserForm;
import com.piccasi.mvc.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/layout.do")
	public ModelAndView other() {
		logger.info("Welcome layout.do .");
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
		ModelAndView model = new ModelAndView();
		
		//model.addObject("message", "ModelAndView");
		model.setViewName("layout");
		
		return model;
	}
	
	@RequestMapping(value = "/json.do")
	public @ResponseBody Map<Object, Object> getJson() {
		List<User> userList = new ArrayList<User>();
		User user = new User();
		logger.info("come json: " + user);
		user.setName("piccasi");
		user.setAge("20");
		userList.add(user);
		
		user = new User();
		user.setName("love");
		user.setAge("33");
		userList.add(user);
		
		String[] meta = {"name", "age"};
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("meta", meta);
		map.put("userList", userList);
		
		return map;
	}
	
	@RequestMapping(value = "/index.do")
	public ModelAndView index(ModelAndView m) {
		logger.info("come index: ");
		m.setViewName("index");
		
		return m;
	}
	
	@RequestMapping(value = "/getUser.do")
	public @ResponseBody Map<Object, Object> getUser(HttpServletRequest request) {
		logger.info("come getUser: " + request.getParameter("page") + ", "  + request.getParameter("rows"));
		int page = Integer.valueOf(request.getParameter("page"));
		int rows = Integer.valueOf(request.getParameter("rows"));
		Map<Object, Object> retMap = new HashMap<Object, Object>();
		List<Integer> pageList = new ArrayList<Integer>();
		pageList.add(15);
		pageList.add(30);
		pageList.add(45);
		List<User> userList = UserService.getUsers(page, rows);
		retMap.put("total", userList.size());
		retMap.put("rows", userList);
		retMap.put("pageSize", 15);
		retMap.put("pageList", pageList);
		return retMap;
	}
	
	@RequestMapping(value = "/query.do", consumes = "application/json")
	public @ResponseBody Map<Object, Object> query(@RequestBody QueryParam queryParam) {
		logger.info("come query: " + queryParam);
		
		List<User> userList = UserService.getByQueryParam(queryParam);
		
		logger.info("queryParam: " + queryParam);

/*		User user1 = new User();
		//logger.info("come json: " + user);
		user1.setName("name2");
		user1.setAge("22");
		userList.add(user1);
		
		user1 = new User();
		user1.setName("name3");
		user1.setAge("31");
		userList.add(user1);
		
		//String form = {};
		UserForm userForm = new UserForm();
		userForm.setName("autoCreate");
		userForm.setAge(500);*/
		//userForm.setSex(1);
		
		String[] meta = {"name", "age"};
		//Map<String, Map<String, String>> formMeta = new HashMap<String, Map<String,String>>();
		Map<String, String> formMeta = new HashMap<String, String>();
		//formMeta.put("action", "query.do");
		formMeta.put("name", "input");
		formMeta.put("age", "input");
		//formMeta.put("sex", "select");
		//formMeta.put("formMeta", metaValue);
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("meta", meta);
		map.put("form", queryParam);
		//map.put("page", page);
		map.put("formMeta", formMeta);
		map.put("userList", userList);
		
		return map;
	}
	
}
