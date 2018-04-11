package com.lianwei;

/**
 * @ClassName: BreakContiuin
 * @Description: TODO(break continue)
 * @author joychen
 * @date 2018年4月3日 江西微软件有限公司
 */
public class BreakContiuin {

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			System.out.println("外" + j);
			for (int i = 0; i < 10; i++) {
				System.out.print("  内" + i);
				if (i == 5) {
//					break; // 跳出当前循环
					continue;   //结束当前循环继续下一次循环
				}
				System.out.print("a");
				System.out.print("b");
			}
			System.out.println("");
		}

	}

}
