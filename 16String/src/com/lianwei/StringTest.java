package com.lianwei;

/**
* @ClassName: StringTest
* @Description: TODO(字符串详解)
* @author joychen
* @date 2018年4月23日
* 江西微软件有限公司
*/
public class StringTest {

	public static void main(String[] args) {
		String name = "小强";
		System.out.println(name+"在吃饭");
		String name1 = new String("小红");
		System.out.println(name1);
		Dog dog = new Dog("小狗1","土狗");
		Dog dog1 = new Dog("小狗1","土狗");
		if (dog.equals(dog1)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		//字符串池
		//
		String type1 = new String("土狗");
		String type2 = new String("土狗");
		
		if (type1.equals(type2)) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		// 字符串的拼接
		System.out.println(name+"在吃饭"+"哈哈");
		//拼接2 
		StringBuffer sb = new StringBuffer();
		sb.append(name).
		append("在吃饭").
		append("哈哈");
		System.out.println(sb);
		
		
		//字符串分割  //按指定的字符串分割
		String info = "姓名 数学 语文 英语 计算机 体育";
		String score[] = info.split(" ");
		System.out.println(score[3]);
		
		// 
//		System.out.println(info.indexOf("英"));
//		System.out.println(info.substring(info.indexOf("英语")));
	
		System.out.println(info.lastIndexOf("语"));
		System.out.println(info.indexOf("数学"));
		
		System.out.println(info.substring(info.indexOf("数学")+2, info.indexOf("计算机")).trim());
		
		System.out.println(info.substring(7,8));
		
		
		//替换
		System.out.println(info.replace(" ","\t"));
		//包含
		if (info.contains("java")) {
			System.out.println("有");
		}else {
			System.out.println("无");
		}
		
		String name3 = "joychen";
		String name4 = "JOYCHEN";
		if (name3.equalsIgnoreCase(name4)) {
			System.out.println("名字相同");
		}else {
			System.out.println("名字不同");
		}
		
	
	}

	
}
