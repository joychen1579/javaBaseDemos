package com.lianwei;

/**
* @ClassName: HomeWork03
* @Description: TODO(循环 )
* @author joychen
* @date 2018年3月29日
* 江西微软件有限公司
*/
public class HomeWork03 {

	public static void main(String[] args) {
		int line = 1;
		int i = 1;
		while(line<=10) {
			int j = i;
			while (j>0) {
				System.out.print("*");
				j--;
			}
			
			
			System.out.println("");
			if (line <5) {
				i++;
			}else if(line >5) {
				i--;	
			}
			line++;
		}
		
		System.out.println("-------");
	}


}
