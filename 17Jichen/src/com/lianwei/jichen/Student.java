package com.lianwei.jichen;
/**
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月25日
* 江西微软件有限公司
*/
public class Student extends People {
	
	
	
	public Student(String name, int id) {
		super();
		
	}

	private int greade;
	
	
	
	@Override
	public String like() {
		System.out.println("玩游戏");
		super.like();
		super.fun1();
		return "";
	}
	
	@Override
	public String toString() {
		return "SB";
	}
	
	
}
