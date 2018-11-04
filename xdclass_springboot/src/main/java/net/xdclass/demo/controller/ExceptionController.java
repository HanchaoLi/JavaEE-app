package net.xdclass.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import net.xdclass.demo.entity.JsonData;
import net.xdclass.demo.entity.User;

/**
 * 功能描述：文件测试
 *
 * <p> 创建时间：Apr 22, 2018 11:22:29 PM </p> 
 * <p> 作者：小D课堂</p>
 */
@RestController
@PropertySource({"classpath:application.properties"})
public class ExceptionController {

	 
	
	@RequestMapping(value = "/api/v1/test_txt")  
	public Object index() {
		int i = 1 / 0;
		return new User(11,"3w3","11222", new Date());
	}


	
}
