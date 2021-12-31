package com.Aasif.demo;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
   @RequestMapping("home")
  
	//public ModelAndView home(@RequestParam("aname") String name , HttpSession session)
   public ModelAndView home(Alian alian)
	{
	  ModelAndView mv = new ModelAndView();
	  
		
		mv.addObject("obj", alian);
		mv.setViewName("home");
		return mv;
	}
}
