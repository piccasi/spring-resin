package com.piccasi.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

import com.piccasi.mvc.beans.QueryParam;
import com.piccasi.mvc.model.User;

public class UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	private static List<User> userList = new ArrayList<User>();
	
	static {
		
		User user = new User();
		user.setId(1);
		user.setName("王平");
		user.setAge("4");
		userList.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("王平");
		user.setAge("4");
		userList.add(user);
		
		user = new User();
		user.setId(3);
		user.setName("王平");
		user.setAge("4");
		userList.add(user);
		
		user = new User();
		user.setId(4);
		user.setName("王平");
		user.setAge("4");
		userList.add(user);
		
		user = new User();
		user.setId(5);
		user.setName("李静");
		user.setAge("5");
		userList.add(user);
		
		user = new User();
		user.setId(6);
		user.setName("李静");
		user.setAge("5");
		userList.add(user);
		
		user = new User();
		user.setId(7);
		user.setName("李静");
		user.setAge("5");
		userList.add(user);
		
		user = new User();
		user.setId(8);
		user.setName("李静");
		user.setAge("5");
		userList.add(user);
		
		user = new User();
		user.setId(9);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(10);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(11);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(12);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(13);
		user.setName("大头");
		user.setAge("7");
		userList.add(user);
		
		user = new User();
		user.setId(8);
		user.setName("李静");
		user.setAge("5");
		userList.add(user);
		
		user = new User();
		user.setId(9);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(10);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(11);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(12);
		user.setName("猪头彬");
		user.setAge("6");
		userList.add(user);
		
		user = new User();
		user.setId(13);
		user.setName("大头");
		user.setAge("7");
		userList.add(user);
	}
	
	public static List<User> getUsers(int page, int rows) {
		int total = userList.size();
		int query = rows * page;
		int endIndex = total - query > 0 ? query : total;
		
		return userList.subList(rows * (page - 1), endIndex);
	}
	
	public static List<User> getByQueryParam(QueryParam queryParam) {
		logger.info("getByQueryParam: " + queryParam);
		
		String name = queryParam.getName();
		String age = queryParam.getAge();
		int curPage = Integer.valueOf(queryParam.getCurPage());
		int pageSize = Integer.valueOf(queryParam.getPageSize());
		
		
		List<User> result = new ArrayList<User>(userList);
		
		if(name != null && name.length() > 0) {
			for (int i = 0; i < result.size(); i++) {
				if(!name.equals(result.get(i).getName())) {
					result.remove(i);
				}
			}
		}
		
		logger.info("result 1: " + result);
		
		if(age != null && age.length() > 0) {
			logger.info("come age: " + age + ", size: " + result.size());
			int size = userList.size();
			for (int i = 0; i < size; i++) {
				//logger.info("result.get("+ i + ") :" + result.get(i));
				if(!age.equals(userList.get(i).getAge())) {
					//logger.info("remove:" + result.get(i));
					result.remove(userList.get(i));
				}
			}
		}
		
		logger.info("result 2: " + result);
		
		int count = result.size();
		int endIndex = count > curPage * pageSize ? curPage * pageSize : count;
		queryParam.setCount(count + "");
		
		return result.subList((curPage - 1) * pageSize, endIndex);
	}
}
