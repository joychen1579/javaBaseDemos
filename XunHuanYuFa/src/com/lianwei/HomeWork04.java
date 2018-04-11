package com.lianwei;

/**
* @ClassName: HomeWork04
* @Description: TODO(循环作业 4)
* @author joychen
* @date 2018年3月29日
* 江西微软件有限公司
*/
public class HomeWork04 {

	public static void main(String[] args) {
		int line = 1;
		int i=1;
		while (line<=7) {  //step1.控制 打印行
			//step2 算每行多少空格  开始
			int k1 = 8-2*i;
			while (k1>0) {
				System.out.print(" ");
				k1--;
			}
			//step2 算每行多少空格  结束
			//step3 空格后打印一棵小星星  
			System.out.print("*");
			
			//step 4 打印中间的空格 开始
			int k2 = 0;
			if (line == 1|| line ==7) {
				k2 = 0;
			}else {
				k2 = 4*(i-1) - 1;
				//k2 = i * 4 - 5;
			}
			// 0   3    7   11   15
			while (k2>0) {
				System.out.print(" ");
				k2--;
			}
			//step 4 打印中间的空格 结束
			
			
			
			//step4 打印后面的星星  开始
			if (line==1 || line==7) {
				
			}else {
				System.out.print("*");
			}
			//step4 打印后面的星星  结束
			
			System.out.println("");
			
			if (line< 4) {
				i++;	
			}else {
				i--;
			}
			
			line++;
		}
		System.out.println("----");

	}

	
}
