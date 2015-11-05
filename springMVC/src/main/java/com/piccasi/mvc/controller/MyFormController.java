package com.piccasi.mvc.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.piccasi.mvc.model.UserForm;

@Controller
@RequestMapping(value = "/form")
public class MyFormController {
	private static final Log logger = LogFactory.getLog(MyFormController.class);

	@RequestMapping(value = "/query.do")
	public ModelAndView testFrom(UserForm userForm, Model m) {
		logger.info(userForm);
		
		List<String> roles = new ArrayList<String>();  
		   roles.add("role1");  
		   roles.add("role3");  
		   userForm.setRoles(roles);  
		   List<String> roleList = new ArrayList<String>();  
		   roleList.add("role1");  
		   roleList.add("role2");  
		   roleList.add("role3");  
		ModelAndView mv = new ModelAndView();
		mv.addObject("userFrom", userForm);
		mv.addObject("roleList", roleList);
		mv.setViewName("bbs/bbs_manage");
		
		return mv;
	}
	
	@RequestMapping(value = "/manage.do")
	public ModelAndView manage(HttpServletRequest req, HttpServletResponse rep, UserForm userForm) throws IOException {
		logger.info("come manage.do");
		//rep.getWriter().write("success");
		List<String> roles = new ArrayList<String>();  
		   roles.add("role1");  
		   roles.add("role3");  
		   userForm.setRoles(roles);  
		   List<String> roleList = new ArrayList<String>();  
		   roleList.add("role1");  
		   roleList.add("role2");  
		   roleList.add("role3");  
		ModelAndView mv = new ModelAndView();
		mv.addObject("userFrom", userForm);
		mv.addObject("roleList", roleList);
		mv.setViewName("bbs/content");
		return mv;
	}
	
	@RequestMapping(value = "/content1.do")
	public ModelAndView content1(HttpServletRequest req, HttpServletResponse rep, UserForm userForm) throws IOException {
		logger.info("come content1.do");
		//rep.getWriter().write("success");
		List<String> roles = new ArrayList<String>();  
		   roles.add("role1");  
		   //roles.add("role3");  
		   userForm.setRoles(roles);  
		   List<String> roleList = new ArrayList<String>();  
		   roleList.add("role1");  
		   roleList.add("role2");  
		   roleList.add("role3");  
		ModelAndView mv = new ModelAndView();
		mv.addObject("userFrom", userForm);
		mv.addObject("roleList", roleList);
		mv.setViewName("bbs/content1");
		return mv;
	}
	
	@RequestMapping(value = "/content2.do")
	public ModelAndView content2(HttpServletRequest req, HttpServletResponse rep, UserForm userForm) throws IOException {
		logger.info("come content1.do");
		//rep.getWriter().write("success");
		List<String> roles = new ArrayList<String>();  
		   roles.add("role2");  
		   //roles.add("role3");  
		   userForm.setRoles(roles);  
		   List<String> roleList = new ArrayList<String>();  
		   roleList.add("role1");  
		   roleList.add("role2");  
		   roleList.add("role3");  
		ModelAndView mv = new ModelAndView();
		mv.addObject("userFrom", userForm);
		mv.addObject("roleList", roleList);
		mv.setViewName("bbs/content2");
		return mv;
	}
}
