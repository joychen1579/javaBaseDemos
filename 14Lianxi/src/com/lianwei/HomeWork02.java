package com.lianwei;

public class HomeWork02 {
	/**
	 * @ClassName: HomeWork02
	 * @Description: TODO(这里用一句话描述这个类的作用)
	 * @author joychen
	 * @date 2018年4月16日 江西微软件有限公司
	 */
	public static void main(String[] args) {
		// 显示从100到1000之间所有能被5 和 6整除的数，每行显示10个
		int count = 0;

		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + "\t");
				count++;
				if (count % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}

}
