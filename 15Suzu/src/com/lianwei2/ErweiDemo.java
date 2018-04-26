package com.lianwei2;

import java.util.Scanner;

/**
* @ClassName: ErweiDemo
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月19日
* 江西微软件有限公司
* 
*/
public class ErweiDemo {
	
	
	static String studentInfo[][] = new String[2][2];
	
	public static void main(String[] args) {
		System.out.println("请录入学生的信息:");
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < studentInfo.length; i++) {
			System.out.println("录入第"+(i+1)+"学生的姓名");
			String name = scan.next();
			for (int j = 0; j < studentInfo[i].length; j++) {
				
				System.out.println("录入"+name+"学生的第"+(j+1)+"门成绩");
				String scores = scan.next();
				studentInfo[i][j]= name +"\t"+ scores;
			}
			
		}
		
		
		for (int i = 0; i < studentInfo.length; i++) {
			for (int j = 0; j < studentInfo[i].length; j++) {
				System.out.println(studentInfo[i][j]);
				
			}
		}
		
	}

	
}
