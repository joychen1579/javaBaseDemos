package com.lianwei1;

/**
 * @ClassName: Dog
 * @Description: TODO(狗类构造函数说明)
 * @author joychen
 * @date 2018年4月12日 江西微软件有限公司
 */
public class Dog {

	private String name;
	private String type;
	private String color;
	private String sex;
//	public Dog() {
//		
//	}

	public Dog(String name) {
		this.name = name;
	}
	
	
	

//	public Dog(String name, String type, String color, String sex) {
//		super();
//		this.name = name;
//		this.type = type;
//		this.color = color;
//		this.sex = sex;
//	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", color=" + color + ", sex=" + sex + "]";
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
		color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void eat(String food) {
		System.out.println(name+"在吃"+food);
	}
	
//	public String eat(String food) {
//		System.out.println(name+"在吃"+food);
//		return "aa";
//	}
	
	/**
	 * 
	 * @param food
	 * @param weight 单位kg
	 */
	public void eat(String food,int weight) {
		System.out.println(name+"在吃"+weight+"kg的"+food);
	}
	
	/**
	 * 
	 * @param food
	 * @param weight 单位kg
	 */
	public void eat(int weight,String food) {
		System.out.println(name+"在吃"+weight+"kg的"+food);
	}
	
	public void eat(String food,String color) {
		System.out.println(name+"在吃"+color+"的"+food);
		
	}
	
//	public void eat(String color,String food) {
//		System.out.println(name+"在吃"+color+"的"+food);
//		
//	}
	
	
	public void eat(int weight){
		System.out.println(name+"在吃"+weight+"kg的食物");
	}
	

}
