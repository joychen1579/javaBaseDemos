package com.lianwei1;

/**
* @ClassName: ErWeiShuzu
* @Description: TODO(二维数组)
* @author joychen
* @date 2018年4月17日
* 江西微软件有限公司
*
* 
*/
public class ErWeiShuzu {

	public static void main(String[] args) {
		int nums[][] = new int [4][2];
		nums[0][0] = 1;
		nums[0][1] = 43;
		
		nums[1][0] = 3;
		nums[1][1] = 45;
		
		nums[2][0] = 33;
		nums[2][1] = 34;
		
		nums[3][0] = 23;
		nums[3][1] = 43;
		
		int nums2[][]= {{1,43},{3,45,42},{33,34,3,5,3},{23,43}};
		
//		int nums2 [][] = {{4,6},{34,34},{45,44,2},{34,54}};
//		System.out.println(nums2.length);
//		for (int i = 0; i < nums2[2].length; i++) {
//			System.out.println(nums2[2][i]);
//		}
		
		
//		//三维数组
//		int nums3[][][] = new int[2][3][2];
//		nums3[0][0][0] = 2;
//		nums3[0][0][1] = 3;
//		nums3[0][1][0] = 4;
//		nums3[0][1][1] = 5;
//		nums3[0][2][0] = 6;
//		nums3[0][2][1] = 3;
//		
//		
//		nums3[1][0][0] = 4;
//		nums3[1][0][1] = 6;
//		nums3[1][1][0] = 6;
//		nums3[1][1][1] = 7;
//		nums3[1][2][0] = 7;
//		nums3[1][2][1] = 8;
//		
//		
//		int nums4[][][] = {{{2,3},{4,5},{6,3}},{{4,6},{6,7},{7,8}}};
//		
//		System.out.println(nums4[0][1][1]);
//		System.out.println(nums4[1][1][1]);
//		System.out.println(nums4[1][2][0]);
		
		int num3[][][] = new int[2][3][2];
		num3[0][0][0] = 2;
		num3[0][0][1] = 4;
		num3[0][1][0] = 6;
		num3[0][1][1] = 5;
		num3[0][2][0] = 8;
		num3[0][2][1] = 10;
		
		num3[1][0][0] = 6;
		num3[1][0][1] = 77;
		num3[1][1][0] = 12;
		num3[1][1][1] = 54;
		num3[1][2][0] = 63;
		num3[1][2][1] = 23;
		
		int num4 [][][] = {{{2,4},{6,5},{8,10}},{{6,77},{12,54},{63,23}}};
		
	}

}
