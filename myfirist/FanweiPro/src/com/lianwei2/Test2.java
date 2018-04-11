package com.lianwei2;

import com.lianwei1.Person;

/**
* @ClassName: Test2
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Test2 {

	public static void main(String[] args) {
		int j = 15;
		func(j);
		System.out.println(j);
		
		Person p1 =new Person();
		p1.id = 20;
		func2(p1);
		System.out.println(p1.id);

	}

	
	public static void func(int i) {
		i = 10;
	}
	
	public static void func2(Person p) {
		p.id = 90;
	}

}
