package com.lianwei2;
/**
* @ClassName: Test1
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月11日
* 江西微软件有限公司
*/
public class Test1 {
	
	private static String username="aaa";
	
	public static void main(String[] args) {
		String username = "bbb";
		
		System.out.println(username);
		
		int num1 = 20;
		if (num1 >10) {
			int num2 = 30;
			System.out.println(num1);
			System.out.println(num2);
			if (num2 <15) {
				int num6 = 7;
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num6);
			}
//			System.out.println(num6);
			
		}
//		System.out.println(num2);
		System.out.println(num4);
		fun1(20, "joychen");
	}
	
	public static void count() {
		int num1 = 88;
	}
	
	
	public static int num4 = 99;

	
	public static void fun1(int num1,String username) {
		System.out.println(num1+username);
	}
	
}
