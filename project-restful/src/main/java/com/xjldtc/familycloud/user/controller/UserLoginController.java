package com.xjldtc.familycloud.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xjldtc.framework.common.constants.Constants.ReturnCodeEnum;

@RestController
@RequestMapping(value = "/user")
public class UserLoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		return ReturnCodeEnum.SUCCESS.getName();
	}
	
}
