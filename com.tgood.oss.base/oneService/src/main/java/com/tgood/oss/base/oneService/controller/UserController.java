package com.tgood.oss.base.oneService.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tgood.oss.base.oneService.model.User;
import com.tgood.oss.base.oneService.service.UserService;
import com.tgood.oss.platform.common.model.RestResult;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public RestResult addUser(HttpServletRequest request, @RequestBody User user) {
		RestResult result = new RestResult();
		try {
			userService.addUser(user);
			result.setCode(0);
			result.setDescription("add user success.");
		} catch (Exception e) {
			result.setCode(-1);
			result.setDescription(String.format("add user fail. error=%s", e.getMessage()));
			logger.error("add user fail. error={}");
		}
		return result;
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public RestResult getAllUsers(HttpServletRequest request) {
		List<User> userList = userService.getAllUsers();

		RestResult result = new RestResult();
		result.setCode(0);
		result.setDescription("operation success.");
		result.setData(userList);
		return result;
	}

	@ResponseBody
	@RequestMapping(value="/{user_name}",method = RequestMethod.GET, produces = "application/json")
	public RestResult getUserByName(@PathVariable("user_name") String userName) {
		List<User> userList = userService.getUsersByName(userName);

		RestResult result = new RestResult();
		result.setCode(0);
		result.setDescription("operation success.");
		result.setData(userList);
		return result;
	}
}
