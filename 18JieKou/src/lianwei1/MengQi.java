package lianwei1;

/**
* @ClassName: MengQi
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月26日
* 江西微软件有限公司
*/
public class MengQi extends Animal implements Skill{

	@Override
	public int skillOne() {
		System.out.println("丢泡泡");
		return 80;
	}

	@Override
	public int skillTow() {
		System.out.println("护甲");
		System.out.println("减速");
		return 200;
	}

	@Override
	public int bigSkill() {
		return 400;
	}

	
}
