package com.lianwei1;


/**
* @ClassName: Demo1
* @Description: TODO(递归)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Demo1 {
  //1+2+3+4
	
	public static void main(String[] args) {
		int i = 1;
		int sum  = 0;
		sum = count(i);
//		while (i<=100) {
//			sum+=i;
//			i++;
//		}
		System.out.println(sum);
	}
	
	public static int count(int i) {
		if (i>100) {
			return 0;
		}else {
			return i + count(++i);
			
		}
	}
	
//	public static int count1(int i) {
//		if (i>4) {
//			return 0;
//		}else {
//			return i + count2(++i);
//		}
//	}
//	
//	public static int count2(int i) {
//		if (i>4) {
//			return 0;
//		}else {
//			return i + count3(++i);
//		}
//	}
//	
//	public static int count3(int i) {
//		if (i>4) {
//			return 0;
//		}else {
//			return i + count4(++i);
//		}
//	}
//	
//	public static int count4(int i) {
//		if (i>4) {
//			return 0;
//		}else {
//			return i + count(++i);
//		}
//	}
}
