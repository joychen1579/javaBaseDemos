package com.lianwei.digui;

import java.util.Scanner;

/**
* @ClassName: Demo02
* @Description: TODO(递归案例2)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Demo02 {

	public static void main(String[] args) {
		// 求sum= (n-0)+(n-1)+(n-2 )+ …….+(n-100)
		// 要求不能用循环。只能用函数实现。(函数的递归)
		System.out.println("请输入一个整数:");
		int sum = 0;
		int i = 0;
		int n = new Scanner(System.in).nextInt();
		sum = count(i,n);
		System.out.println(sum);
	}

	private static int count(int j,int n) {
		if (j > 100) {
			return 0;
		}else {
			return  n - j + count(++j, n);
		}
	}

	
}
