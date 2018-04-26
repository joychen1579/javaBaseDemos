package lianwei1;
/**
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月26日
* 江西微软件有限公司
*/
public class Test {

	public static void main(String[] args) {
//		Skill.attack = 6;
		
//		Skill sk = new Hero();
//		Skill sk2 = new MengQi();
		Hero h = new Hero();
		MengQi mq = new MengQi();
		attack1(h);
		attack1(mq);
		Skill nuWa  = new NuWa();
		attack2(nuWa);
		if (h instanceof SkllFour) {
			attackFour((SkllFour)nuWa);
		}else {
			System.out.println("不可调用4技能");
		}
		
		
	}
	
	public static void attack1(Skill skill) {
		skill.skillOne();
	}
	
	public static void attack2(Skill skill) {
		skill.skillTow();
	}
	
	public static void attackBig(Skill skill) {
		skill.bigSkill();
	}
	
	public static void attackFour(SkllFour skill) {
		skill.skillFour();
	}

	
}
