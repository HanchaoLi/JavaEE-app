package net.xdclass.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.demo.entity.ServerSettings;
import net.xdclass.demo.entity.User;

@RestController
public class GetController {

	private Map<String, Object> params = new HashMap<>();
	
//	@RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
//	public Object findUser(@PathVariable("city_id") String cityId,
//			@PathVariable("user_id") String userId) {
//		params.clear();
//		params.put("cityId", cityId);
//		params.put("userId", userId);
//		
//		return params;
//	}
	
	@GetMapping(value = "/v1/page_user1")
	public Object pageUser(int from, int size) {
		params.clear();
		params.put("from", from);
		params.put("size", size);
		return params;
	}
	
	@GetMapping(value="/v1/page_user2")
	public Object pageUser2(@RequestParam(defaultValue="0", name="page", required =true) int from,
			int size) {
		params.clear();
		params.put("from", from);
		params.put("size", size);
		return params;
	}
	/**
	 * post method to put user object
	 * notice, http header content-type should be application/json
	 * @param user
	 * @return
	 */
	@RequestMapping("v1/save_user")
	public Object saveUser(@RequestBody User user) {
		params.clear();
		params.put("user", user);
		return params;
	}
	
	/**
	 * add token into header
	 * @param accessToken
	 * @param id
	 * @return
	 */
	@GetMapping("/v1/get_header")
	public Object getHeader(@RequestHeader("access_token") String accessToken, String id) {
		params.clear();
		params.put("accessToken", accessToken);
		params.put("id", id);
		return params;
	}
	
	/**
	 * user HttpServletRequest to get params
	 * @param request
	 * @return
	 */
	@GetMapping("/v1/test_request")
	public Object testRequest(HttpServletRequest request) {
		params.clear();
		String id = request.getParameter("id");
		params.put("id", id);
		return params;
	}
	
	@Autowired
	private ServerSettings serverSettings;
	
	@GetMapping("/api/v1/test_properties")
	public Object testPeroperties(){
		
		return serverSettings;	
	}
	
	@GetMapping(value="/api/v1/account")
	public Object account() {
		params.clear();
		params.put("money", "1000");
		return params;
	}
}
