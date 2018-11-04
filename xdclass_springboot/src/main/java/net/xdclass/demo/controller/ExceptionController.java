package net.xdclass.demo.controller;

import java.util.Date;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo.entity.MyException;
import net.xdclass.demo.entity.User;

/**
 * 功能描述：异常测试
 *
 * <p> 创建时间：Apr 22, 2018 11:22:29 PM </p> 
 *
 */
@RestController

public class ExceptionController {

	 
	/**
	 * 功能描述：模拟全局异常
	 * @return
	 */
	@RequestMapping(value = "/api/v1/test_ext")  
	public Object index() {
		int i= 1/0;
		return new User(11, "sfsfds", "1000000", new Date());
	}

	
	/**
	 * 功能描述：模拟自定义异常
	 * @return
	 */
	@RequestMapping("/api/v1/myext")
	public Object myexc(){
		
		throw new MyException("499", "my ext异常");
		
	}
	
}

