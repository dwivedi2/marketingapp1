package com.marketingapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketingapp1.Entity.Mark;
import com.marketingapp1.servic.MarkServic;

@Controller
public class MarkController {
	
	@Autowired
	private MarkServic markservic;//connect service layer
	
	//http://localhost:8080/create
	@RequestMapping("/create")//web servlet annotation
	public String viewCreateMark() {
		return "NewMarketingapp1";// act lick requestdispacher load this page in server
	}
	
	@RequestMapping("/saveMark")//action calling
	public String saveMark(Mark mark) {
//		markservic.saveMark(mark);
		System.out.println(mark.getName());
		System.out.println(mark.getAge());
		System.out.println(mark.getSalary());
		System.out.println(mark.getExperiance());
		System.out.println(mark.getRollnumber());
		return"NewMarketingapp1";
	}

}
