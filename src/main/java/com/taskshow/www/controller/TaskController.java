package com.taskshow.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {
	@RequestMapping(value = "/task/taskProject", method = RequestMethod.GET)
	public void taskProjectGet() {	
		
	}
}
