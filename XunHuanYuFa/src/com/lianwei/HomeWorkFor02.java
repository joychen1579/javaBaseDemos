package com.lianwei;
/**
* @ClassName: HomeWorkFor02
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月3日
* 江西微软件有限公司
*/
public class HomeWorkFor02 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 4; i++) {
			
			for (int k = 8-i*2; k > 0; k--) {
				System.out.print(" ");
			}
			
			for (int j = 2*i-1; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		

	}

	
}
