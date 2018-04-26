package lianwei1;
/**
* @ClassName: NuWa
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月26日
* 江西微软件有限公司
*/
public class NuWa extends People implements SkllFour{

	@Override
	public int skillOne() {
		System.out.println("黑暗方块");
		return 60;
	}

	@Override
	public int skillTow() {
		System.out.println("推箱子");
		return 90;
	}

	@Override
	public int bigSkill() {
		System.out.println("传送");
		return 100;
	}

	@Override
	public int skillFour() {
		System.out.println("全局攻击");
		return 200;
	}

	
}
