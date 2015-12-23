package com.dubbo.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.demo.model.User;
import com.dubbo.demo.service.IUserService;


public class UserServiceImpl implements IUserService{

	private static Map<Integer,User> mapUser = new ConcurrentHashMap<Integer,User>();
	
	public User save(User user) {
		Random random = new Random();
		int key = random.nextInt(100);
		mapUser.put(key, user);
		return user;	
	}

	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = mapUser.get(id);
		return user;
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		mapUser.remove(id);
	}

	public List<User> listUsers() {
		// TODO Auto-generated method stub
		List<User> lists = new ArrayList<User>();
		for(Map.Entry<Integer, User> key : mapUser.entrySet()){
			lists.add(key.getValue());
		}
		return lists;
	}

}
