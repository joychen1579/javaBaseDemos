package com.lianwei;
/**
* @ClassName: WhileXunHuan
* @Description: TODO(While循环)
* @author joychen
* @date 2018年3月28日
* 江西微软件有限公司
*/
public class WhileXunHuan {

	public static void main(String[] args) {
//		//求 1+2+3+4+5....+100 的和
//		int i = 1;   //4
//		int sum = 0;  //10
//		
//		while(i<=100) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println("1+2+3+4...+100的和是:"+sum);
	
//		int i = 1;
//		while(i<=6) {
//			int j = 1;
//			while (j<=i) {
//				System.out.print("*");
//				j++;
//			}	
//			System.out.print("\n");
//			i++;
//		}
//		
	
		int i  = 1;
		while(i<=4) {   //控制行
			//  打印列的时候前面空格  开始
			int k = 8 - i*2;
			while(k>0) {
				System.out.print(" ");
				k--;
			}
		    //  打印列的时候前面空格   结束
			
			//  
			int j = 2 * i -1;
			while(j>0) {
				System.out.print("* ");
				j--;
			}
			
		
			System.out.println("");
			i++;
		}
		
	
		
	}

	
}
