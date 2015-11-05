package com.piccasi.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserVerifyFilter implements Filter {
	private static final Log logger = LogFactory.getLog(UserVerifyFilter.class);

	@Override
	public void destroy() {
		System.out.println("destroy");
		logger.info("....destroy");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		System.out.println("do UserVerifyFilter");
		logger.info("....do UserVerifyFilter");
		HttpServletRequest req = (HttpServletRequest) arg0;
/*		if(!"piccasi".equals(req.getParameter("name"))) {
			req.getRequestDispatcher("error.jsp").forward(arg0, arg1);
			return;
		}*/
		
		Map<String, String> menu = new HashMap<String, String>();
		menu.put("帖子管理", "hello.do");
		menu.put("sina", "http://sina.com");
		menu.put("qq", "http://qq.com");
		
		
		//req.getSession(false);//.setAttribute("user", "springmvc");
		req.setAttribute("__menu_list", menu);
		req.setAttribute("userFrom", "piccasi");
		arg2.doFilter(req, arg1);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init UserVerifyFilter");
		logger.info("....init UserVerifyFilter");
	}

}
