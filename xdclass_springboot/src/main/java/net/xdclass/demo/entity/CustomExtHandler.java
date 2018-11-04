package net.xdclass.demo.entity;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * global error handler
 * @author Lee
 *
 */
//  if use @ControllerAdvice, then should add @ResponseBody on top of method
@RestControllerAdvice
public class CustomExtHandler {
	
	@ExceptionHandler(value = Exception.class)
	Object handleException(Exception e, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		map.put("code", 100);
		map.put("msg", e.getMessage());
		map.put("url", request.getRequestURL());
		return map;
	}
	
	@ExceptionHandler(value=MyException.class)
	Object handleMyException(MyException e,HttpServletRequest request){
		//jump to error.html
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("error.html");
	    modelAndView.addObject("msg", e.getMessage());
	    return modelAndView;
		

    }

}
