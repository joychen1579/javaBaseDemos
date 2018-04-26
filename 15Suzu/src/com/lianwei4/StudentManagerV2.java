package com.lianwei4;

import java.util.Scanner;

/**
 * @ClassName: StudentManagerV2
 * @Description: TODO(学生管理系统v2)
 * @author joychen
 * @date 2018年4月20日 江西微软件有限公司
 */
public class StudentManagerV2 {
	static Scanner scan = new Scanner(System.in);
	static String names[] = new String[2];
	static int score[][] = new int[names.length][5];
	
	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.println("请输入要用的功能编号:");
			int choose = scan.nextInt();
			switch (choose) {
			case 1:
				intputStudentInfo();
				break;
			case 2:
				showAllInfo();
				break;
			case 3:
				System.out.println("请输入要查询学生的姓名");
				String name = scan.next();
				findScoreByName(name);
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:
				System.out.println("系统已退出！");
				System.exit(0);
				break;

			default:
				System.out.println("输入错误，请重新输入!");
				break;
			}

		}

	}

	public static void menu() {
		System.out.println("\n\n");
		System.out.println("\t\t学生成绩管理系统\t\t");
		System.out.println("\t\t支持10位学生,五门成绩\t\t");
		System.out.println("\t1.录入学生成绩\t2.显示全部学生成绩");
		System.out.println("\t3.查询学生成绩\t4.求学生总分");
		System.out.println("\t5.显示最高分\t6.显示最低分");
		System.out.println("\t7.查看学生平均分\t8.退出系统");
	}
	
	public static void intputStudentInfo() {
		System.out.println("\t\t开始录入学生信息");
		for (int i = 0; i < names.length; i++) {
			System.out.println("请输入第"+(i+1)+"个学生的姓名:");
			names[i] = scan.next();
		}
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("请录入"+names[i]+"的"+getCoursName(j)+"成绩:");
				score[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\t\t信息录入完成");
	
	}
	
	public static void showAllInfo() {
		System.out.println("\t\t显示所有学生信息");
		System.out.println("姓名\t数学\t英语\t计算机\t体育\t语文");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static void findScoreByName(String name) {
		int index =0;
		System.out.println("\t\t显示"+name+"学生信息");
		System.out.println("姓名\t数学\t英语\t计算机\t体育\t语文");
		
		//1.获取学生在数组中的下标
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				index = i;
				break;
			}
		}
		System.out.print(name+"\t");
		for (int i = 0; i < score[index].length; i++) {
			System.out.print(score[index][i]+"\t");
		}
	}
	
	public static String getCoursName(int i) {
		switch (i) {
		case 0:
			return "数学";
		case 1:
			return "英语";
			
		case 2:
			return "计算机";
			
		case 3:
			return "体育";
			
		case 4:
			return "语文";

		default:
			return "无";
		}
	}

}
