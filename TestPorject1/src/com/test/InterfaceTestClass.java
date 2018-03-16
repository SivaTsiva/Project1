package com.test;

public class InterfaceTestClass implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTestClass itc=new InterfaceTestClass();
		itc.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Interface1.super.show();
	}





}
