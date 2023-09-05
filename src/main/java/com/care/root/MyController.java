package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //서버는 루트까지만 잡아줌, root/index로 보내주세요
public class MyController {
	
	@RequestMapping("/index") //ㅕurl 연결 경로 
	public String memvberIndex(Model model) {
		System.out.println("index실행");
		model.addAttribute("value", "기본 페이지 입니다");
		return "member/index"; //views 폴더에 경로 제일 마지막은 jsp파일 -> 폴더/jsp파일
	}
	
	@RequestMapping("/login")
	public String memberLogin(Model model) {
		System.out.println("login 실행");
		model.addAttribute("value", "로그인 페이지 입니다");
		
		return "member/login";
	}
	
	@RequestMapping("/logout")
	public String memberLogout(Model model) {//model과 뷰를 따로따로 사용하는 방식
		System.out.println("logout실행");
		model.addAttribute("value","로그아웃 페이지 입니다."); //범위는 request와 같다. 해당하는 키(test)가 로그아웃으러 전달
		return "member/logout";
	}
}
