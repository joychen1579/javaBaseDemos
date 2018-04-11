package com.lianwei;

/**
* @ClassName: HomeWork01
* @Description: TODO(作业03 99 表)
* @author joychen
* @date 2018年3月29日
* 江西微软件有限公司
*/
public class HomeWork01 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=9) {
			int j = 1;
			while(j<=i) {
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
				j++;
			}
			System.out.println("");
			i++;
		}
		System.out.println("---------");
	}

}
