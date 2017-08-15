package com.kodali.Sorting;

public class Users implements Comparable<Users> {
	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	//
	@Override
	public int compareTo(Users obj) {
		return this.userName.compareTo(obj.getUserName());

	}

}
