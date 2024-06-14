package com.exam.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.exam.dto.Member;
import com.exam.service.MemberService;


@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//로그인 협력자
	@GetMapping(value={"/login"})
	public String showLoginPage() {
		
		return "loginForm";
	}

	@GetMapping(value={"/login_fail"})
	public String showlogin_failPage() {
		logger.info("logger:showlogin_failPage");
		return "redirect:login";
	}

	@GetMapping(value={"/login_success"})
	public String showlogin_successPage() {
		logger.info("logger:showlogin_successPage");
		return "redirect:home";
	}
}
