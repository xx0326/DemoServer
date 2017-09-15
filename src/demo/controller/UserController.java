package demo.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.User;
import demo.service.UserService;
import demo.util.ResponseUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	public void test(@RequestParam(value="uid",required=false)Integer uid,HttpServletResponse response) throws Exception{
		JSONObject result=new JSONObject();
		
		ArrayList<User> users = new ArrayList<User>();
		users.add(userService.find(uid));
		users.add(userService.find(uid));
		users.add(userService.find(uid));
		result.put("users", users);
		result.put("list", users);
		ResponseUtil.write(result, response);
	}
	
}
