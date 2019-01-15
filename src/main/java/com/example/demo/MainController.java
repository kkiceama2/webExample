package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public ModelAndView main1() {
		ModelAndView mv = new ModelAndView("init");
        mv.addObject("test", "test");
        
        return mv;

	}
	
	@RequestMapping(value="/main")
	public ModelAndView main2() {
		ModelAndView mv = new ModelAndView("init");
        mv.addObject("test", "test");
        
        return mv;

	}
}