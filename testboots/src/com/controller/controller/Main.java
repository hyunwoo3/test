package com.controller.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.controller.util.Navi;
import com.service.frame.Biz;
import com.service.vo.Cust;
@Controller
public class Main {
	
	@Resource(name="custbiz")
	Biz biz;
	
	@RequestMapping("/main.do")
	public String main(){
		return "/pages/main";
	}
	
	@RequestMapping("/go.do")
	public ModelAndView go(String next){
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("center", next);
		mv.addObject("navi",Navi.getNavi(next));

		return mv;
	}
	

	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request, String id, String pwd){
		ModelAndView mv = new ModelAndView("main");
		
		Cust result = null;
		
		try {
			result = (Cust)biz.get(id);
			
			if(result != null && (result.getPwd().equals(pwd))){
				HttpSession session = request.getSession();
				session.setAttribute("login", result);
				mv.addObject("center", "mcenter");
			}else {
				request.setAttribute("center", "mcenter");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request){
			HttpSession session = request.getSession();
			if(session != null){
				session.invalidate();
			}
			return "main";
		}
	
}






