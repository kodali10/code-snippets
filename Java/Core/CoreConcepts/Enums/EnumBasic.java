package com.kodali.enums;

public class EnumBasic {

	public static void main(String[] args) {
		String obj = (Basic.Objects.Car).toString();
		System.out.println(obj);
	}
}

class Basic {
	enum Objects {
		Car, Yatch, Train
	}
}