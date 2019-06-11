package com.taskshow.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskshow.www.dao.face.TaskDao;
import com.taskshow.www.service.face.TaskService;

@Service
public class TaskServiceImpl implements TaskService{
	@Autowired TaskDao taskDao;
}
