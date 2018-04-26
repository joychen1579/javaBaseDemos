package com.lianwei2;
/**
* @ClassName: Teacher
* @Description: TODO(这里用一句话描述这个类的作用)
* @author joychen
* @date 2018年4月24日
* 江西微软件有限公司
* 
*/
public class Teacher  extends People{
	private int salary;
	private String [] banzhuren;
	private String course;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String[] getBanzhuren() {
		return banzhuren;
	}
	public void setBanzhuren(String[] banzhuren) {
		this.banzhuren = banzhuren;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
