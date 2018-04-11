package com.lianwei.digui;


/**
* @ClassName: Demo01
* @Description: TODO (递归)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Demo01 {
	
	public static void main(String[] args) {
		//1+2+3
		int i = 1;
		int sum = 0;
		sum = count1(i);
		System.out.println(sum);
		
	}
	
	public static int count1(int i) {
		if (i>3) {
			return 0;
		}else {
			return i+ count1(++i);
		}
	}
	

	
}
