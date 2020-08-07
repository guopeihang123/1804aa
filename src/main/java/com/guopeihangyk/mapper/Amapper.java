package com.guopeihangyk.mapper;

import java.util.List;
import java.util.Map;

import com.guopeihangyk.bean.Activity;
import com.guopeihangyk.bean.Server;
import com.guopeihangyk.bean.Type;

public interface Amapper {

	public List<Activity> sel(Map<String, Object> map);
	
	public int del(Integer aid);
	
	public int dels(Integer aid);
	
	public int add(Activity aa);
	
	public int adds(Map<String, Object> map);
	
	public List<Type> selx();
	
	public List<Server> self();
	
	public Activity selo(Integer aid);
	
	public int update(Activity aa);
}
