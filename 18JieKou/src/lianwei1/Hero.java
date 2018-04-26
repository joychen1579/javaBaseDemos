package lianwei1;
/**
* @ClassName: Hero
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月26日
* 江西微软件有限公司
*/
public class Hero extends People implements Skill{
	
	private int hp;
	private int maxhp;
	private int armor;
	private int mokang;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getMokang() {
		return mokang;
	}
	public void setMokang(int mokang) {
		this.mokang = mokang;
	}
	
	
	@Override
	public int skillOne() {
		System.out.println("鸡飞");
		return 25;
	}
	@Override
	public int skillTow() {
		System.out.println("狗跳");
		return 100;
	}
	@Override
	public int bigSkill() {
		System.out.println("沉默");
		return 200;
	}
	
	
	
}
