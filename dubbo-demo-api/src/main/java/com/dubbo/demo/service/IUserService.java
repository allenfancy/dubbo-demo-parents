package com.dubbo.demo.service;

import java.util.List;

import com.dubbo.demo.model.User;

public interface IUserService {

	public User save(User user);
	
	public User getUserById(Integer id);
	
	public void deleteById(Integer id);
	
	public void sayHello(String name);
	
	public List<User> listUsers();
}
