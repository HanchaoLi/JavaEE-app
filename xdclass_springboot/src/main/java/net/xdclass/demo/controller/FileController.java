package net.xdclass.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import net.xdclass.demo.entity.JsonData;

/**
 * 功能描述：文件测试
 *
 * <p> 创建时间：Apr 22, 2018 11:22:29 PM </p> 
 * <p> 作者：小D课堂</p>
 */
@Controller
public class FileController {

	 
	
	@RequestMapping(value = "/api/v1/gopage")  
	public Object index() {
		
		return "index";
	}

	
	
	
    	private static final String filePath = "E:\\j2ee\\workspace\\xdclass_springboot\\src\\main\\resources\\static\\images\\";
   
	
	 	@RequestMapping(value = "upload")
	    @ResponseBody
	    public JsonData upload(@RequestParam("head_img") MultipartFile file,HttpServletRequest request) {
	      
	 		//  should have file size, empty, validation
	 		String name = request.getParameter("name");
	 		System.out.println("username "+name);
	        
	        String fileName = file.getOriginalFilename();	        
	        System.out.println("filename " + fileName);
	        
	        String suffixName = fileName.substring(fileName.lastIndexOf("."));
	        System.out.println("appendix " + suffixName);
	        
	        fileName = UUID.randomUUID() + suffixName;
	        System.out.println("name after upload "+fileName);
	        
	        File dest = new File(filePath + fileName);
	       
	        try {
	            file.transferTo(dest);
	            
	            return new JsonData(0, fileName);
	        } catch (IllegalStateException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return new JsonData(-1, "fail to save ", null);
	    }

	
	
	
}
