package net.xdclass.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.xdclass.demo.entity.ServerSettings;

@Controller
@RequestMapping("/freemaker")
public class FreemakerController {
	
	@Autowired
	private ServerSettings setting;
	
	@GetMapping("hello")
	public String index(ModelMap modelMap) {
		modelMap.addAttribute("setting", setting);
		return "fm/index";
	}
}

