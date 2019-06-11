package com.taskshow.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taskshow.www.service.face.TaskService;

@Controller
public class TaskController {
	@Autowired TaskService taskService;
	
	@RequestMapping(value = "/task/taskProject", method = RequestMethod.GET)
	public void taskProjectGet() {	
		
	}
}
