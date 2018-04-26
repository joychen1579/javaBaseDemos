package com.lianwei2;

import com.lianwei1.Dog;

/**
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*
* 
*/
public class Test {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("小强");
		System.out.println(stu1.getName());
		
		
		Object p1  = new Dog();
		People p2 = new Student();
		
		
		
		if (p1 instanceof Student) {
			Teacher t1 = (Teacher)p1;
			t1.setSalary(1000);
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
		
		
		System.out.println();
	}

	
}