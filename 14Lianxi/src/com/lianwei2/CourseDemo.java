package com.lianwei2;

import java.util.Scanner;

/**
 * @ClassName: CourseDemo
 * @Description: TODO(综合练习version 1.0)
 * @author joychen
 * @date 2018年4月16日 江西微软件有限公司
 */
public class CourseDemo {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String name1;
	public static String name2;
	public static String name3;
	public static String name4;
	public static String name5;
	public static String name6;
	public static String name7;
	public static String name8;
	public static String name9;
	public static String name10;
	
	public static double course1;
	public static double course2;
	public static double course3;
	public static double course4;
	public static double course5;
	public static double course6;
	public static double course7;
	public static double course8;
	public static double course9;
	public static double course10;
	

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("\n\n");
			menu();
			System.out.print("请选择功能:");
			int choose = scan.nextInt();
			switch (choose) {
			case 1:
				inputStudentInfo();
				break;
			case 2:
				showStudentInfo();
				break;
			case 3:
				System.out.println("功能3");
				break;
			case 4:
				studentSum();
				break;
			case 5:
				System.out.println("功能5");
				break;
			case 6:
				System.out.println("功能6");
				break;
			case 7:
				System.out.println("功能7");
				break;
			case 8:
				System.out.println("已退出系统");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误");
				break;
			}

		}
		
		

	}

	public static void menu() {
		System.out.println("\t\t学生成绩管理系统\t\t");
		System.out.println("\t\t支持10位学生,一门成绩\t\t");
		System.out.println("\t1.录入学生成绩\t2.显示全部学生成绩");
		System.out.println("\t3.查询学生成绩\t4.求学生总分");
		System.out.println("\t5.显示最高分\t6.显示最低分");
		System.out.println("\t7.查看学生平均分\t8.退出系统");

	}
	
	/**
	 * 录入学生成绩
	 */
	public static void inputStudentInfo() {
//		Scanner scan = new Scanner(System.in);
		System.out.println("请录入第1个学生姓名:");
		name1 = scan.next();
		System.out.println("请录入第2个学生姓名:");
		name2 = scan.next();
		System.out.println("请录入第3个学生姓名:");
		name3 = scan.next();
		System.out.println("请录入第4个学生姓名:");
		name4 = scan.next();
		System.out.println("请录入第5个学生姓名:");
		name5 = scan.next();
		System.out.println("请录入第6个学生姓名:");
		name6 = scan.next();
		System.out.println("请录入第7个学生姓名:");
		name7 = scan.next();
		System.out.println("请录入第8个学生姓名:");
		name8 = scan.next();
		System.out.println("请录入第9个学生姓名:");
		name9 = scan.next();
		System.out.println("请录入第10个学生姓名:");
		name10 = scan.next();
		
		System.out.println("请录入"+name1+"的成绩");
		course1 = scan.nextDouble();
		System.out.println("请录入"+name2+"的成绩");
		course2 = scan.nextDouble();
		System.out.println("请录入"+name3+"的成绩");
		course3 = scan.nextDouble();
		System.out.println("请录入"+name4+"的成绩");
		course4 = scan.nextDouble();
		System.out.println("请录入"+name5+"的成绩");
		course5 = scan.nextDouble();
		System.out.println("请录入"+name6+"的成绩");
		course6 = scan.nextDouble();
		System.out.println("请录入"+name7+"的成绩");
		course7 = scan.nextDouble();
		System.out.println("请录入"+name8+"的成绩");
		course8 = scan.nextDouble();
		System.out.println("请录入"+name9+"的成绩");
		course9 = scan.nextDouble();
		System.out.println("请录入"+name10+"的成绩");
		course10 = scan.nextDouble();
		
		System.out.println("学生信息录入完成");
		
		
	}
	
	/**
	 * 展示学生信息
	 */
	public static void showStudentInfo() {
		System.out.println(name1+"的成绩是"+course1);
		System.out.println(name2+"的成绩是"+course2);
		System.out.println(name3+"的成绩是"+course3);
		System.out.println(name4+"的成绩是"+course4);
		System.out.println(name5+"的成绩是"+course5);
		System.out.println(name6+"的成绩是"+course6);
		System.out.println(name7+"的成绩是"+course7);
		System.out.println(name8+"的成绩是"+course8);
		System.out.println(name9+"的成绩是"+course9);
		System.out.println(name10+"的成绩是"+course10);
	}
	
	/**
	 * 3查找学生
	 * @param name
	 */
	public static void selectStudent(String name) {
		
	}
	
	/**
	 * 求学生总分
	 */
	public static void studentSum() {
		System.out.println(course1+course2+course3+course4+course5+course6+course7+course8+course9+course10);
	}
	
	

}
