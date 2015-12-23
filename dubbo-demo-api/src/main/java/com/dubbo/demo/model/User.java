package com.dubbo.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private Boolean booleans;
	
	private List<String> lists = new ArrayList<String>();
	
	private Map<String,User> maps = new HashMap<String,User>();
	
	private Set<User> sets = new HashSet<User>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBooleans() {
		return booleans;
	}

	public void setBooleans(Boolean booleans) {
		this.booleans = booleans;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<String, User> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, User> maps) {
		this.maps = maps;
	}

	public Set<User> getSets() {
		return sets;
	}

	public void setSets(Set<User> sets) {
		this.sets = sets;
	}
	
	
 
}
