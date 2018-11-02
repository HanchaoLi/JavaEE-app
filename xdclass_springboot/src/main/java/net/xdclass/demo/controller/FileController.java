package net.xdclass.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FileController {

	@RequestMapping(value="/api/v1/gopage")
	public Object index() {
		return "index";
	}
}
