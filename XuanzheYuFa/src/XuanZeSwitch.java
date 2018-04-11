import java.util.Scanner;

/**
 * @ClassName: XuanZeSwitch
 * @Description: TODO(选择 之 switch)
 * @author joychen
 * @date 2018年3月22日 江西微软件有限公司
 */
public class XuanZeSwitch {

	public static void main(String[] args) {
		// switch
		// int num5 = 2;
		// switch (num5) {
		// case 1:
		// System.out.println("匹配一");
		// break;
		// case 2:
		// System.out.println("匹配二");
		// System.out.println("匹配二二二");
		// break;
		// case 3:
		// System.out.println("匹配三");
		//
		// case 4:
		// System.out.println("匹配四");
		// break;
		// default:
		// System.out.println("默认");
		// break;
		// }
		//

		// int c = 'a';
		// switch (c) {
		// case 'a':
		// System.out.println("我是a");
		// break;
		// case 98:
		// System.out.println("我是b");
		// break;
		// case 99:
		// System.out.println("我是c");
		// break;
		// case 100:
		// System.out.println("我是d");
		// break;
		// default:
		// System.out.println("我是谁");
		// break;
		// }
		// MyMeiJu mymeiju = MyMeiJu.lishi;
		// switch (mymeiju) {
		// case lishi:
		// System.out.println(MyMeiJu.lishi);
		// break;
		// case zhangsan:
		// System.out.println(MyMeiJu.zhangsan);
		// break;
		// case wangwu:
		// System.out.println(MyMeiJu.wangwu);
		// break;
		// case yingying:
		// System.out.println(MyMeiJu.yingying);
		// break;
		// default:
		// System.out.println("傻A");
		// break;
		// }

		// 请输入您的身高，对应计算出穿多大码的衣服
		// 身高在150到160间穿的是S
		// 身高在160到165间穿的是L

		// int height = new Scanner(System.in).nextInt();
		// switch (height) {
		// case 150:
		// case 151:
		// case 152:
		// case 153:
		// case 154:
		// case 155:
		// case 156:
		// case 157:
		// case 158:
		// case 159:
		// case 160:
		// System.out.println("你可以穿S码的衣服");
		// break;
		// case 161:
		// case 162:
		// case 163:
		// case 164:
		// case 165:
		// case 166:
		// System.out.println("你可以穿L码的衣服");
		// break;
		// default:
		// System.out.println("没有适合您的衣服");
		// break;
		// }
		//

		// 产生一个1到4之间的随机数
		// 当生成的是1 打印 I feel fine *
		// 当生成的是2 打印 I've been better *;
		// 当生成的是3 打印 I feel horrible *
		// 当生成的是4 打印 I feel terrific *

		int num1 = (int) (Math.random() * 4) + 1;
		switch (num1) {
		case 1:
			System.out.println("I feel fine *");
			break;
		case 2:
			System.out.println("I've been better *");
			break;
		case 3:
			System.out.println("I feel horrible *");
			break;
		case 4:
			System.out.println("I feel terrific *");
			break;
		}
			
		
		// 三元表达式 ? :
		int num6 = 9;
		int num7 = 11;
		int num9 = num6 < num7 ? num6++ : 99;
		int num10 = num6 < num7 ? num6++ : 99;
		System.out.println(num9);
		System.out.println(num6);
		add(num6> num7 ? num7:88);
		
		System.out.println("程序结束");

	}
	
	public static void add(int n) {
		System.out.println(n);
	}

}
