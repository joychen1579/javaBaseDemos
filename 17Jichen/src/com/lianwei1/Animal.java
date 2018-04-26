package com.lianwei1;
/**
* @ClassName: Animal
* @Description: TODO(动物类)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*/
public class Animal {
	
	private String type;
	private String sex;
	private boolean isFly = false;
	private String color;
	private boolean isRuanSheng;
	private int iq;
	
	public Animal() {}
	
	public Animal(String type, String sex, boolean isFly, String color, boolean isRuanSheng, int iq) {
		this.type = type;
		this.sex = sex;
		this.isFly = isFly;
		this.color = color;
		this.isRuanSheng = isRuanSheng;
		this.iq = iq;
	}
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRuanSheng() {
		return isRuanSheng;
	}
	public void setRuanSheng(boolean isRuanSheng) {
		this.isRuanSheng = isRuanSheng;
	}
	
	public void eat(String food) {
		System.out.println("吃"+food);
	}
	
	
	
}
