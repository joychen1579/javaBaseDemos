package com.lianwei;


/**
* @ClassName: HomeWork01
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月16日
* 江西微软件有限公司
*/
public class HomeWork01 {
	
//	编写一个显示(英里转换成千米)表格的程序，(注意：1英里为1.609千米）可用函数实现
//			格式如下：
//			英里 千米
//			1         1.609
//			2         3.218
//			...
//			10         16.09

	public static void main(String[] args) {
		System.out.println("英里\t千米");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+"\t"+getQianmi(i));
		}
	}
	
	/**
	 * 英里转换成千米
	 * @param yinli   
	 * @return
	 */
	public static double getQianmi(double yinli) {
		return yinli * 1.609;
	}

	
}
