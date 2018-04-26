package com.lianwei1;
/**
* @ClassName: Dog
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*/
public class Dog extends Animal {
	public Dog() {}
	
	public Dog(String type, String sex, boolean isFly, String color, boolean isRuanSheng, int iq) {
		super(type, sex, isFly, color, isRuanSheng, iq);
	}
	
	public void eatTea() {
		super.eat("茶");
	}
}
