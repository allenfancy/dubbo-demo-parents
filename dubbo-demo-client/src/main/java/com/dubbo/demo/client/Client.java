package com.dubbo.demo.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.model.User;
import com.dubbo.demo.service.IUserService;

public class Client {

	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		IUserService iService = (IUserService) ac.getBean("userService");
		iService.sayHello("ni hao ");
		
		User user = new User();
		user.setId(1);
		user.setAge(23);
		user.setBooleans(false);
		user.setLists(Arrays.asList("吴涛","fancy","wutao"));
		Map<String,User> map = new HashMap<String,User>();
		User u = new User();
		u.setName("bosh");
		map.put("1", u);
		
		user.setName("ALLEN  IVERSON");
		Set<User> set = new HashSet<User>();
		set.add(u);
		user.setSets(set);
		
		User user1 = iService.save(user);
		System.out.println(user1.getName());
		
		List<User> userlist = iService.listUsers();
		System.out.println(userlist.size());
		for(int i=0;i<userlist.size();i++){
			System.out.println(userlist.get(i).getName() + " " + userlist.get(i).getMaps() + " " + userlist.get(i).getLists());
		}
	}
}
