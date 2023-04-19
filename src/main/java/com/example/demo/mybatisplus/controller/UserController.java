package com.example.demo.mybatisplus.controller;


import com.example.demo.mybatisplus.mapper.UserMapper;
import com.example.demo.mybatisplus.pojo.User;
import com.example.demo.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cyc
 * @since 2023-04-19
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;


	@Autowired
	private UserMapper userMapper;


	@RequestMapping("/test") void test(){

		User user=new User();
		user.setName("yixin");
		user.setAge(18);

		boolean flag=userService.save(user);
		System.out.println(flag);



		System.out.println(userMapper.selectList(null));


		System.out.println(userMapper.testGetAll());


	}

}

