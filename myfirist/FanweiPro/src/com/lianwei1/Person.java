package com.lianwei1;
/**
* @ClassName: Person
* @Description: TODO(范围访问)
* @author joychen
* @date 2018年4月10日
* 江西微软件有限公司
*/
public class Person {
	//成员变量
	
	public int id;
	public String username;
	private String password;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.username = "joychen1";
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
