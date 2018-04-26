package com.lianwei.jichen;

/**
* @ClassName: People
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月25日
* 江西微软件有限公司
*/
public class People extends Animal {
	
	
	private String name;
	private int id;
	
	public People() {
		System.out.println("我是People的无参构造函数");
	}
	
	
	public People(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public final void fun1() {
		System.out.println("煮饭");
		super.like();
	}
	
	@Override
	public String like() {
		System.out.println("喜欢学习！");
		super.like();
		super.getColor();
		return super.like();
	}
	
	
	public void playGame(String gameName) {
		new Thread() {
			@Override
			public void run() {
				
				System.out.println(gameName);
			}
		};
//		gameName = "aa";
		System.out.println(name+"正在玩"+gameName);
	}
	
	

}
