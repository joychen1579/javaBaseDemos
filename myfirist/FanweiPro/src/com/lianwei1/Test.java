package com.lianwei1;
/**
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Test {
	
	public static int count = 10;
	
	public static void main(String[] args) {
		Person p = new Person();
		p.id = 10;
		p.username = "joychen";
//		int count = 20;
//		System.out.println(Test.count);
		int num1 = 15;
		if (num1 < 40) {
			int num2 = 20;
			num1 = 10;
			
			if (num2 >5) {
				int num3 = 17;
				int count = 1;
				System.out.println(num2);
			}
			
//			System.out.println(num3);
			
		}
		System.out.println(num1);
//		System.out.println(num2);
		
	}

	
}
