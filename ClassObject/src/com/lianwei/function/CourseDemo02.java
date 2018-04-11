package com.lianwei.function;

import java.util.Scanner;

/**
 * @ClassName: CourseDemo02
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author joychen
 * @date 2018年4月8日 江西微软件有限公司
 */
public class CourseDemo02 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一边a:");

		a = scanner.nextInt();
		System.out.println("请输入第一边b:");
		b = scanner.nextInt();
		System.out.println("请输入第一边c:");
		c = scanner.nextInt();

		if (CourseDemo1.isSanjiao(a, b, c)) {
			System.out.println(zhouchang(a, b, c));
			System.out.println(areacount(a, b, c));

		}

	}

	protected static double areacount(int a, int b, int c) {
		double p = (a + b + c) / 2;
		double temp = p * (p - a) * (p - b) * (p - c);

		return Math.sqrt(temp);
	}

	public static double zhouchang(int a, int b, int c) {
		return a + b + c;
	}

}
