package com.lianwei;

/**
* @ClassName: Dog
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月23日
* 江西微软件有限公司
*/
public class Dog {
	private String name;
	private String type;
	
	public Dog() {}
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
