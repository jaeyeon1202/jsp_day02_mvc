package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //������ ��Ʈ������ �����, root/index�� �����ּ���
public class MyController {
	
	@RequestMapping("/index") //��url ���� ��� 
	public String memvberIndex(Model model) {
		System.out.println("index����");
		model.addAttribute("value", "�⺻ ������ �Դϴ�");
		return "member/index"; //views ������ ��� ���� �������� jsp���� -> ����/jsp����
	}
	
	@RequestMapping("/login")
	public String memberLogin(Model model) {
		System.out.println("login ����");
		model.addAttribute("value", "�α��� ������ �Դϴ�");
		
		return "member/login";
	}
	
	@RequestMapping("/logout")
	public String memberLogout(Model model) {//model�� �並 ���ε��� ����ϴ� ���
		System.out.println("logout����");
		model.addAttribute("value","�α׾ƿ� ������ �Դϴ�."); //������ request�� ����. �ش��ϴ� Ű(test)�� �α׾ƿ����� ����
		return "member/logout";
	}
}
