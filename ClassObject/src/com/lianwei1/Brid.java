package com.lianwei1;

/**
 * @ClassName: Brid
 * @Description: TODO(Brid)
 * @author joychen
 * @date 2018年4月3日 江西微软件有限公司
 */
public class Brid {
	
	String name;
	String color;
	String weight;
	int speed;  // km/h
	
	public void fly() {
		System.out.println(color + "的鸟以" + speed + "km/h" + "飞行");
		
	}
	
	public static void main(String[] args) {
		Brid b = new Brid();
		b.name="大鵬";
		b.color ="金色";
		b.speed = 20;
		b.weight = "50kg";
		
		b.fly();
	}

}
