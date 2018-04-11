import java.util.Scanner;

/**
	* @ClassName: XuanZeIf
	* @Description: 选择之  if
	* @author joychen
	* @date 2018年3月22日
	* 江西微软件有限公司
	*
	* 
	*/
public class XuanZeIf {

	public static void main(String[] args) {
//		//  if
//		int num1 = 7;
//		int num2 = 10;
//		if (num1 > num2) 
//			System.out.println("哈哈哈");
//		
//		System.out.println("呵呵呵");
//		if (num1 < num2) {
//			System.out.println("嘻嘻嘻");
//		}else {
//			System.out.println("嘿嘿嘿");
//		}
//		
//		int num3 = 20;
//		if(num1 > num2) {
//			System.out.println("啦啦啦");
//		}else if(num3 > num2) {
//			System.out.println("咻咻咻");
//		}else if(num1 < num2) {
//			System.out.println("吧啦吧啦");
//		}
//		else {
//			System.out.println("喵喵喵");
//		}
//		
//		//上课案例
//		//从控制台输入一个小红的成绩,如果大于等于80分就打印“通过”，
//		//如果小于80分则打印出“需要补考”。
////		int num6;
////		scanf("%d",&num6);
//		System.out.print("请输入一个分数:");
//		Scanner  scan1 = new Scanner(System.in);
//		double num6 = scan1.nextDouble();
//		if(num6 >= 80) {
//			System.out.println("通过");
//		}else {
//			System.out.println("需要补考");
//		}
		
//		从控制台输入成绩 如果大于等于90 输出：优秀， 
//		如果大于等于80分 小于90分， 输出良好，
//		如果大于等于70分 小于80分，输出一般，
//		如果大于等于60分 小于70分，输出及格，
//		如果小于60分，输出不及格
		try {
			System.out.print("请输入一个分数:");
			Scanner scan2 = new Scanner(System.in);
			double score = scan2.nextDouble();
			if (score >= 90) {
				System.out.println("优秀");
			}else if(score >=80 && score < 90) {
				System.out.println("良好");
			}else if(score >=70 && score <80) {
				System.out.println("一般");
			}else if(score >=60 && score <70) {
				System.out.println("及格");
			}else {
				System.out.println("不及格");
			}
		}catch (Exception e) {
			System.out.println("格式输入错误");
		}
		
		
		
		
		
		System.out.println("程序结束");

	}

	
}
