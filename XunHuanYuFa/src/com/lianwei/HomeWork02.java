package com.lianwei;
/**
* @ClassName: HomeWork02
* @Description: TODO(循环之菱形打印)
* @author joychen
* @date 2018年3月29日
* 江西微软件有限公司
*
* 
*/
public class HomeWork02 {

	public static void main(String[] args) {
		int line = 1;
		int i= 1;
		while(line<=7) {
			int k = 8-i*2;
			while(k>0) {
				System.out.print(" ");
				k--;
			}
			
			int j = i * 2 -1;
			while(j>0) {
				System.out.print("* ");
				j--;
			}
			
			System.out.println("");
			if (line>=4) {
				i--;
			}else {
				i++;
			}
			line++;
		}
		System.out.println("----");
	}

	
}
