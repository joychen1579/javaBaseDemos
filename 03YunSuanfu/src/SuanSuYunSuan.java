
/**
	* @ClassName: SuanSuYunSuan
	* @Description: TODO(算术运算符讲解)
	* @author joychen
	* @date 2018年3月15日
	* 江西微软件有限公司 
	*/
public class SuanSuYunSuan {

	public static void main(String[] args) {
		//  + (加)  -(减)  *(乘)  /(除)  %(余) 
//		++(在自身基础上加1)  --(在自身基础上减1)
		
		//+ 加   
		int num1 = 5;
		int num2 = 4;
		System.out.println(num1+num2+"");  //整形和字符串  会以字符串来拼接
		char c = 'a';    //char 和 int 类型会转换成ascii 的十进制来运算
		System.out.println(num1+c);
		System.out.println(c+"my");   //char  和字符串。就是字符串拼接
	
		//- 减
		float num3 = 4.3f;
		int num4 = 5;
		System.out.println(num4 - num3);  
		System.out.println(num3 - num4);
		
		// * 乘
		System.out.println(num3 * num4);
		System.out.println(num1 * num2);
		
		
		// /除
		System.out.println(num4 / 3);   //两个数都是整形就会把小数点切掉
		System.out.println(num4 / num3);  // 只有一个数是浮点型就会保留小数点
		try {
			System.out.println(num4 / 0);
		}catch (Exception e) {
			System.out.println("我出错了！"+e.getMessage());
		}
		System.out.println("哈哈哈");
		
		
		// % 余  
		int num5  = 9;
		int num6 = 4;
		System.out.println(num5% num6);
		float num7 =3.3f;
		System.out.println(num5 % num7);   
		System.out.println(num7 % num6);
		
		//  ++  
		int num8 = 77;
		System.out.println(num8++); // 77   ++放后面先用再加
		System.out.println(num8);   // 78 
		System.out.println(++num8);   // 79    ++放前面先加再用
		System.out.println(num8);  //  79   
		
		int num9 = 45;
		int num10 = 1;
		System.out.println(num10+++num9++);
		System.out.println(++num9+num10++);
		System.out.println(1+num9++ + ++num10);
		//运行完上面代码后  num9  和num10的值 分别是多少
		
		// --  
		int num11  = 22;
		System.out.println(num11 --);   //22  --放后面是先用再减
		System.out.println(--num11);   //  20   --放前面是先减再用
		System.out.println(num11);    // 20
		
		int num12 = 46;
		int num13 = 21;
		System.out.println(num12---num13--);
		System.out.println(++num13+num12--);
		System.out.println(1+num13-- + ++num12);
		//运行完上面代码后  num12  和num13的值 分别是多少
	}
	
	

	
}
