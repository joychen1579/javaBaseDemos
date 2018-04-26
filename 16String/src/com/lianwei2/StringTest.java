package com.lianwei2;

/**
* @ClassName: StringTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
*/
public class StringTest {

	public static void main(String[] args) {
		String name = "小强";
		System.out.println(name+"在吃饭");
		
		Cat c1 = new Cat("加菲猫","花花");
		Cat c2 = new Cat("加菲猫","花花");
		
		if (c1 == c2) {
			System.out.println("相等");
		}else {
			System.out.println("不等");
		}
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		String name2 ="花花";
		String name3 = new String("花花");
		
		if (c2.getName() == name3) {
			System.out.println("相等");
		}else {
			System.out.println("不等");
		}
		
		//字符串拼接
		StringBuffer sb = new StringBuffer();
		sb.append(name).append("在吃饭").append("打豆豆");
		System.out.println(sb);
		
		//字符串分割
		String info ="姓名,英语,数学,语计算机,语文,体育";
		System.out.println(info);
		String score[] = info.split(",");
		System.out.println(score[2]);
		
		
		
		//字符串剪切
		int index = info.indexOf("数");
		System.out.println(info.substring(index,index+2));
		
		int index1 = info.indexOf("语");
		System.out.println(index1);
//		int lastIndex = info.lastIndexOf("语");
//		System.out.println(lastIndex);
//		info = info.substring(info.indexOf("语")+1);
//		System.out.println(info);
//		int beIndex = info.indexOf("语");
//		String result = info.substring(beIndex,beIndex+4);
//		System.out.println(result);
		
		System.out.println(info.substring(11,12));
		
		String name5 = "joychen1 ";
		String name6 = "JOYchen";
		if (name5.equalsIgnoreCase(name6)) {
			System.out.println("相等");
		}else {
			System.out.println("不等");
		}
		
		System.out.println(name5.hashCode());
		String myinfo = info.replaceFirst(",","\t");
		System.out.println(myinfo);
		
		if (info.contains("java")) {
			System.out.println("有");
		}else {
			System.out.println("无");
		}
		
		System.out.println(name6.toUpperCase());
		
		System.out.println(name5.trim());
		
		String studentinfo = "%s在%s";
		System.out.println(String.format(studentinfo, "小明","吃屎"));
		
	}

	
}
