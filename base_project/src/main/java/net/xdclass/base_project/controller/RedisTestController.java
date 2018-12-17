package net.xdclass.base_project.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.utils.JsonUtils;

@RestController
@RequestMapping("/api/v1/redis")
public class RedisTestController {

	@Autowired
	private StringRedisTemplate redisTpl;
	
	@GetMapping(value="add")
	public Object add() {
		redisTpl.opsForValue().set("name", "lee");
		return JsonData.buildSuccess("OK");
	}
	
	@GetMapping(value="get")
	public Object get() {
		String value = redisTpl.opsForValue().get("name");
		return JsonData.buildSuccess(value);
	}
	
//	@GetMapping(value="setuser")
//	public Object setUser() {
//		User user = new User();
//		user.setName("lee");
//		user.setAge(11);
//		user.setCreateTime(new Date());
//		user.setPhone("3243423");
//		String userstr = JsonUtils.obj2String(user);
//		redisTpl.opsForValue().set("user:11", userstr);
//		return JsonData.buildSuccess("OK");
//	}
	
	@GetMapping(value="getuser")
	public Object getUser() {
		User user = JsonUtils.string2Obj(redisTpl.opsForValue().get("user:11"), User.class);
		return JsonData.buildSuccess(user);
	}
}
