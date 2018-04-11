package com.lianwei.function;

import java.util.Scanner;

import com.lianwei.one.Person;

/**
 * @ClassName: CourseDemo1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author joychen
 * @date 2018年4月8日 江西微软件有限公司
 */
public class CourseDemo1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一边a:");
		a = scanner.nextInt();
		System.out.println("请输入第一边b:");
		b = scanner.nextInt();
		System.out.println("请输入第一边c:");
		c = scanner.nextInt();

		if (isSanjiao(a, b, c)) {
			System.out.println("此三边可以构成三角形");
			if (a==b || a==c||c==b) {
				System.out.println("此三边可以构成等腰三角形");
			}
			
		} else {
			System.out.println("此三边不可以构成三角形");
		}
		
		if (isSanjiao(a, b, c)) {
			
			System.out.println("三角形的周长是:"+(a+b+c));
		}
		
		if (isSanjiao(a, b, c)) {
			
			System.out.println("这里计算三角形的面积");
		}
		
	}
	
	/**
	 * 跟据传入的三边，判断是否是三角形
	 * @param a  第一边
	 * @param b  第二边
	 * @param c  第三边
	 * @return   反回是否是三角形
	 */
	public static boolean isSanjiao(int a,int b,int c) {
		if (a + b > c && a + c > b && c + b > a && a - b < c && b - a < c && a - c < b && c - a < b && b - c < a
				&& c - b < a) {
			return true;
		}
		return true;
	}
	
	public static Person getPerson() {
		return new Person();
	}
	
}
