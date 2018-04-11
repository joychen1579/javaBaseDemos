package com.lianwei;

import java.util.Scanner;

/**
 * @ClassName: FunctionTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author joychen
 * @date 2018年4月3日 江西微软件有限公司
 */
public class FunctionTest {

	public static void main(String[] args) {
		// 给出三边长计算出这个函数是否是三角形。
		// 如果是三角形，再判断一下是否能构成等腰三角形
		// 如果是三角形，再计算一下周长
		// 如果是三角形，再计算一下三角形的面积
		// 如。。。。。

		Scanner scan = new Scanner(System.in);
		System.out.println("从控制台输入a的边长:");
		int a = scan.nextInt();
		System.out.println("从控制台输入b的边长:");
		int b = scan.nextInt();
		System.out.println("从控制台输入c的边长:");
		int c = scan.nextInt();

		if (isSanJiao(a, b, c)) {
			//
			System.out.println("三边长可以构成三角形");
			if (a==b||a==c||c==b) {
				System.out.println("可以构成等腰三角形");
			}
		}else {
			System.out.println("输入三边长不能构成三角形");
		}
		
		if (isSanJiao(a, b, c)) {
			System.out.println("三角形的周长是:"+(a+b+c));
		}
		
		if (isSanJiao(a, b, c)) {
			double p = (a+b+c)/2;
			double temp = p*(p-a)*(p-b)*(p-c);
			double area = Math.sqrt(temp);
			System.out.println("三角形的面积是:"+area);
		}

	}
	
	/**
	 * 判断是否是三角形
	 * @param a  第一边长
	 * @param b  第二边长
	 * @param c  第三边长
	 * @return   返回  true 代表是三角形  否则不是
	 */
	public static boolean isSanJiao(int a,int b,int c) {
		if (a + b > c && a + c > b && b + c > a && a - b < c && b - a < c && a - c < b && c - a < b && c - b < a
				&& b - c < a) {
			return true;
		}else {
			return false;
		}
		
	}

}
