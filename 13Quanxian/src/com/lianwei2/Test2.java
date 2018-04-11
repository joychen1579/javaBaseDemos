package com.lianwei2;
/**
* @ClassName: Test2
* @Description: TODO(引用传递和值传递)
* @author joychen
* @date 2018年4月11日
* 江西微软件有限公司
*/
public class Test2 {

	public static void main(String[] args) {
		
		int num1 = 40;
		fun1(num1);
		System.out.println(num1);
		
		Persion p = new Persion();
		p.id = 20;
		fun2(p);
		System.out.println(p.id);
	}
	
	public static void fun1(int num1) {
		num1 = 30;
	}
	
	public static void fun2(Persion p1) {
		p1.id = 60;
	}

	
}
