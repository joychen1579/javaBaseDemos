package com.lianwei1;

import java.util.Scanner;

/**
* @ClassName: Demo2
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Demo2 {

	public static void main(String[] args) {
		//求sum= (n-0)+(n-1)+(n-2 )+ …….+(n-100)
		//要求不能用循环。只能用函数实现。(函数的递归)
		System.out.println("从控制台输入一个整数:");
		int n  = new Scanner(System.in).nextInt();
		int num = 0;  
		int i = 0;
		
		
	}

	
	public static int count(int i,int n) {
		if (i>100) {
			return 0;
		}else {
			return n-i + count(++i, n);
		}
	}

}
