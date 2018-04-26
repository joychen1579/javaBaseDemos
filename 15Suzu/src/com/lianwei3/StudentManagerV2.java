package com.lianwei3;

import java.util.Scanner;

/**
 * @ClassName: StudentManagerV2
 * @Description: TODO(学生信息管理系统)
 * @author joychen
 * @date 2018年4月19日 江西微软件有限公司
 * 
 */
public class StudentManagerV2 {
	static Scanner scan = new Scanner(System.in);
	
	static String names[] = new String [2];
	static int scores[][] = new int[names.length][5];

	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.println("请选择一个功能:");
			int choose = scan.nextInt();
			switch (choose) {
			case 1:
				intputStudentInfo();
				break;
			case 2:
				showAllInfo();
				break;
			case 3:
				System.out.println("请输入要找的学生:");
				String name = scan.next();
				findInfoByName(name);
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
				System.out.println("程序已结束");
				System.exit(0);
				break;
			default:
				break;
			}

		}

	}

	/**
	 * 菜单
	 */
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
		System.out.println("\t\t开始学生姓名录入");
		for (int i = 0; i < names.length; i++) {
			System.out.println("请输入第"+(i+1)+"个学生的姓名:");
			names[i] = scan.next();
		}
		System.out.println("\t\t学生姓名录入结束");
		System.out.println("\n\t\t开始学生成绩录入");
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println("请输入"+names[i]+"的"+getCourseName(j)+"成绩:");
				scores[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\n\t\t学生成绩录入完成！");
	}
	
	public static void showAllInfo() {
		System.out.println("姓名\t数学\t英语\t计算机\t体育\t语文");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+"\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			
			System.out.println("");
		}
	}
	
	public static void findInfoByName(String name) {
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("没有这个学生");
		}else {
			System.out.println("姓名\t数学\t英语\t计算机\t体育\t语文");
			System.out.print(names[index]+"\t");
			for (int i = 0; i < scores[index].length; i++) {
				System.out.print(scores[index][i]+"\t");
			}
		} 		
		
	}
	
	
	public static String getCourseName(int i) {
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
			return "无课";
		}
	}

}
