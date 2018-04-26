package com.lianwei2;

import java.util.Scanner;

/**
* @ClassName: ScoreStore
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月19日
* 江西微软件有限公司
*/
public class ScoreStore {
	
	static String names[] = new String [3];
	static int scores[] = new int [3];
	
	public static void main(String[] args) {
		
		System.out.println("开始录入学生姓名");
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("请输入第"+(i+1)+"个学生的姓名");
			names[i] = scan.next();
		}
		
		

		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第"+names[i]+"个学生的成绩");
			scores[i] = scan.nextInt();
		}
		
		System.out.println("录入所有学生的信息:");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"的成绩是"+scores[i]);
			
		}
	}

	
}
