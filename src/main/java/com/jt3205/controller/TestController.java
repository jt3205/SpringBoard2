package com.jt3205.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt3205.domain.UserVO;

@Controller
@RequestMapping("/test/")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("doA")
	public void doA(){
		logger.info("doA가 호출되었습니다.");
	}
	
	@RequestMapping("doB")
	public String doB(@ModelAttribute("msg") String msg, Model model){
		logger.info("doB가 호출되었습니다.");
		return "bbb";
	}
	
	@RequestMapping("getBean")
	public void getBean(Model model) {
		logger.info("getBean이 호출되었습니다.");
		UserVO vo = new UserVO();
		vo.setUid("jt3205");
		vo.setUpw("1234");
		vo.setUname("박형진");
		model.addAttribute("user", vo);
	}
}
