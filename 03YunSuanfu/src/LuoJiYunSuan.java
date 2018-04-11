/**
	* @ClassName: LuoJiYunSuan
	* @Description: TODO(逻辑运算讲解)
	* @author joychen
	* @date 2018年3月15日
	* 江西微软件有限公司
	*
	* 
	*/
public class LuoJiYunSuan {

	public static void main(String[] args) {
//		 & (逻辑与)   ^ (逻辑异或)     |(逻辑或) 
//		！（非）    && (逻辑与)    || (逻辑或)
		
//		&&逻辑与    //两个进行判断  必需同时为真  才为真
		int num1 = 54;
		int num2 = 56;
		int num3 = 4;
		System.out.println(num1 < num2 && num1 < num3);   //false
		System.out.println(num1 > num2 && num1++ < num3);  //false
		System.out.println(num1);  //
		
		// || 逻辑或  //两个进行判断  其中一个为真 就为真
		System.out.println(num1 > num2 || num1 > num3);
		System.out.println(num1 < num2 || num1-- > num3);
		System.out.println(num1);
		
		// ! 非   真的变假   假的变真
		System.out.println(!!!(num2>num1));
		
		// &  逻辑与    两个条件都要满足才满足
//		一个 & 符逻辑与与两个&& 功能基本一样，
//		只不过，不管前面的条件是否为假，后面的条件都会全部进行运算。
		int num4 = 11;
		int num5 = 14;
		int num6 = 20;
		System.out.println(num4 > num5 & num5++> num6);
		System.out.println(num5);
		
		// | 逻辑或     其中一个条件满足就全部满足
//		一个 | 符逻辑与与两个|| 功能基本一样，
//		只不过，不管前面的条件是否为真，后面的条件都会全部进行运算。
		
		System.out.println(num4<num5 | num5++> num6);
		System.out.println(num5);
		
		// ^ 逻辑异或    两个条件不相同才为真
		System.out.println(false ^ true);
		
		
		
		
		
	}

	
}
