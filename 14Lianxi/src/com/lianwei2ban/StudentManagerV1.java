package com.lianwei2ban;

import java.util.Scanner;

/**
 * @ClassName: StudentManagerV1
 * @Description: TODO(练习学生管理系统v1.0)
 * @author joychen
 * @date 2018年4月17日 江西微软件有限公司
 */
public class StudentManagerV1 {
	
	static Scanner scan = new Scanner(System.in);
	private static String name1;
	private static String name2;
	private static String name3;
	private static String name4;
	private static String name5;
	private static String name6;
	private static String name7;
	private static String name8;
	private static String name9;
	private static String name10;
	
	private static int score1;
	private static int score2;
	private static int score3;
	private static int score4;
	private static int score5;
	private static int score6;
	private static int score7;
	private static int score8;
	private static int score9;
	private static int score10;
	

	public static void main(String[] args) {

		while (true) {
			menu();
			System.out.println("请选择菜单功能:");
			
			int choose = scan.nextInt();
			switch (choose) {
			case 1:
				inputStudentInfo();
				break;
			case 2:
				showAllStudent();
				break;
			case 3:
				searchStuent();
				break;
			case 4:
				countSum();
				break;
			case 5:
				// ...
				break;
			case 6:
				// ...
				break;
			case 7:
				// ...
				break;
			case 8:
				System.out.println("系统已退出！");
				System.exit(0);
				break;
			default:
				//  输入错误，请重新输入
				break;
			}

		}

	}

	public static void menu() {
		System.out.println("\n\n");
		System.out.println("\t\t学生成绩管理系统\t\t");
		System.out.println("\t\t支持10位学生,一门成绩\t\t");
		System.out.println("\t1.录入学生成绩\t2.显示全部学生成绩");
		System.out.println("\t3.查询学生成绩\t4.求学生总分");
		System.out.println("\t5.显示最高分\t6.显示最低分");
		System.out.println("\t7.查看学生平均分\t8.退出系统");
	}
	
	/**
	 * 录入学生信息
	 */
	public static void inputStudentInfo() {
		System.out.println("\t\t开始录入学生成绩");
		System.out.println("请输入第1个学生的姓名:");
		name1 = scan.next();
		System.out.println("请输入第2个学生的姓名:");
		name2 = scan.next();
		System.out.println("请输入第3个学生的姓名:");
		name3 = scan.next();
		System.out.println("请输入第4个学生的姓名:");
		name4 = scan.next();
		System.out.println("请输入第5个学生的姓名:");
		name5 = scan.next();
		System.out.println("请输入第6个学生的姓名:");
		name6 = scan.next();
		System.out.println("请输入第7个学生的姓名:");
		name7 = scan.next();
		System.out.println("请输入第8个学生的姓名:");
		name8 = scan.next();
		System.out.println("请输入第9个学生的姓名:");
		name9 = scan.next();
		System.out.println("请输入第10个学生的姓名:");
		name10 = scan.next();
		
		
		System.out.println("请录入"+name1+"的成绩");
		score1 = scan.nextInt();
		System.out.println("请录入"+name2+"的成绩");
		score2 = scan.nextInt();
		System.out.println("请录入"+name3+"的成绩");
		score3 = scan.nextInt();
		System.out.println("请录入"+name4+"的成绩");
		score4 = scan.nextInt();
		System.out.println("请录入"+name5+"的成绩");
		score5 = scan.nextInt();
		System.out.println("请录入"+name6+"的成绩");
		score6 = scan.nextInt();
		System.out.println("请录入"+name7+"的成绩");
		score7 = scan.nextInt();
		System.out.println("请录入"+name8+"的成绩");
		score8 = scan.nextInt();
		System.out.println("请录入"+name9+"的成绩");
		score9 = scan.nextInt();
		System.out.println("请录入"+name10+"的成绩");
		score10 = scan.nextInt();
		
		System.out.println("成绩录入完成");
		
	}
	
	/**
	 * 显示全部学生信息
	 */
	public static void showAllStudent() {
		System.out.println("\t\t显示全部学生信息");
		System.out.println(name1+"的成绩是"+score1);
		System.out.println(name2+"的成绩是"+score2);
		System.out.println(name3+"的成绩是"+score3);
		System.out.println(name4+"的成绩是"+score4);
		System.out.println(name5+"的成绩是"+score5);
		System.out.println(name6+"的成绩是"+score6);
		System.out.println(name7+"的成绩是"+score7);
		System.out.println(name8+"的成绩是"+score8);
		System.out.println(name9+"的成绩是"+score9);
		System.out.println(name10+"的成绩是"+score10);
	}
	
	/**
	 * 查询学生成绩
	 */
	public static void searchStuent() {
		System.out.println("查询学生成绩");
	}
	
	/**
	 * 求学生总分
	 */
	public static void countSum() {
		System.out.println("\t\t计算学生总分");
		int sum = score1+score2+score3+score4+score5+score6+score7+score8+score9+score10;
		System.out.println("学生的总分是："+sum);
	}
	
	

}
