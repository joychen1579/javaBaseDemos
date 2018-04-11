package com.lianwei01;
/**
* @ClassName: Cat
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月11日
* 江西微软件有限公司
*/
public class Cat {
	public int id;
	public String name;
	private String type;
	private String color;
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.id = 20;
		c.name ="花花";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
