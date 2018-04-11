

	/**
	* @ClassName: FuZiYunSuanFu
	* @Description: TODO(符值运算符)
	* @author joychen
	* @date 2018年3月15日
	* 江西微软件有限公司
	*
	* 
	*/
public class FuZiYunSuanFu {

	public static void main(String[] args) {
		//=     +=     -=    *=    /=     %=   
		//	&=  |=     ^=    <<=     >>=    >>>=
		// =  正常赋值 
		int num1 = 5;
		//  +=  在自身基础上加一个数  赋值给本身
		System.out.println(num1+=9);   //14
		//  -=  在自身基础上加一个数  赋值给本身
		System.out.println(num1 -= 2);   //12
		int num2 = 3;
		//  *= 在自身基础上乘一个数  赋值给本身
		System.out.println(num2*=4);  //12
		
		// /=  在自身基础上除一个数  赋值给本身
		int num3 = 36;
		num3 /=3;
		System.out.println(num3);   //12
		
		//  %=  在自身基础上余一个数  赋值给本身
		int num4 = 10;
		num4 %=3;
		System.out.println(num4);
		
        //&=   位与等于   
		int num5 = 6;   
		num5 &= 3;  // num5 = num5 & 3;
		System.out.println(num5);
		
		 //|=   位或等于   
		int num6 = -9;   
		num6 |= 3;  // num6 = num6 | 3;
		System.out.println(num6);
		
	}

}
