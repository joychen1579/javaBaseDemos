package com.lianwei.jichen;
/**
* @ClassName: Animal
* @Description: TODO(动物类)
* @author joychen
* @date 2018年4月25日
* 江西微软件有限公司
*/
public class Animal {
	private String type;
	private String sex;
	private boolean isFly;
	private int age;
	private int weight;
	private int height;
	private int IQ;
	private String color;
	
	
	
	
	
	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public String getSex() {
		return sex;
	}





	public void setSex(String sex) {
		this.sex = sex;
	}





	public boolean isFly() {
		return isFly;
	}





	public void setFly(boolean isFly) {
		this.isFly = isFly;
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





	public int getIQ() {
		return IQ;
	}





	public void setIQ(int iQ) {
		IQ = iQ;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String like() {
		System.out.println("喜欢飞");
		return "sb";
	}
	
	
	
}
