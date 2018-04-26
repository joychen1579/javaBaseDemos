package com.lianwei2;
/**
* @ClassName: People
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*/
public class People {

	private String id;
	private String name;
	private String sex;
	private int age;
	private int weight;
	private int height;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public  void playGame(String gameName) {
		System.out.println(name+"在玩"+gameName);
	}
	
	
}
