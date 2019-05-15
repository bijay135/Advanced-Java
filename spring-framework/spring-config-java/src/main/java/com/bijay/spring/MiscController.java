package com.bijay.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MiscController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name", "Bijay");
		return "hello";
	}

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public ModelAndView greeting() {
		ModelAndView mv = new ModelAndView("greeting");
		mv.addObject("name", "Bijay");
		return mv;
	}
	
	@RequestMapping(path = "/actors", method = RequestMethod.GET)
	public ModelAndView actors() {
		ModelAndView mv = new ModelAndView("actors");
		List<Actors> a = new ArrayList<Actors>();
		Actors a1 = new Actors("Kennau Reevs","Action","Speed","The Matrix","John Wick");
		Actors a2 = new Actors("Tobey Maguire","Sci-Fi","Spiderman","The Great Gatsby","Brothers");
		Actors a3 = new Actors("Will Smith","Comedy","Men in Black","Focus","Hitch");
		Actors a4 = new Actors("Vin Diesel","Fantasy","Riddick","The Last Witch Hunter","Fast and The Furious");
		Actors a5 = new Actors("Tom Hanks","Thriller","Cast Away","Forest Grump","The Green Mile");
		a.add(a1);
		a.add(a2);
		a.add(a3);
		a.add(a4);
		a.add(a5);
		mv.addObject("actors",a);
		return mv;
	}
}
