package com.lianwei2;

/**
* @ClassName: Cat
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*/
public class Cat {
	private String type;
	private String name;
	
	public Cat() {}
	
	public Cat(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
