package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherHttpController {
	
	private Map<String, Object> params = new HashMap<>();
	
	/**
	 * test post mapping
	 * @param id
	 * @param pwd
	 * @return
	 */
	@PostMapping("/v1/login")
	public Object login(String id, String pwd) {
		params.clear();
		params.put("id", id);
		params.put("pwd", pwd);
		
		return params;
	}
	
	/**
	 * test put mapping
	 * @param id
	 * @return
	 */
	@PutMapping("/v1/put")
	public Object put(String id) {
		params.clear();
		params.put("id", id);
		
		return params;
	}
	
	/**
	 * test delete mapping
	 * @param id
	 * @return
	 */
	@DeleteMapping("/v1/del")
	public Object delete(String id) {
		params.clear();
		params.put("id", id);
		
		return params;
	}
}
