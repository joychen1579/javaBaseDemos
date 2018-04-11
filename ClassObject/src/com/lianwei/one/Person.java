package com.lianwei.one;
/**
* @ClassName: Person
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月3日
* 江西微软件有限公司
*/


public class Person {
	public String name;
	String sex;
	String birthday;
	int weight;  //kg
	int height;
	boolean hasTooth;  
	
	
	public void playGame(String gameName) {
		System.out.println(name+"在玩"+gameName+"游戏");
	}
	
}
