package com.test;

import java.util.ArrayList;
import java.util.Map;



public class Testing456 {
	private void m1(ArrayList<String> awSpecList)throws Exception{
		for(int i=0;i<6;i++){
			awSpecList.add(i+"i");
		}
		for(int i=0;i<6;i++){
			System.out.println(awSpecList.get(i));
		}
	}
public static void main(String[] args) {

	ArrayList<String> awSpecList = null;
	boolean lockObtained=false;
	Testing456 test=new Testing456();
	try {
		test.m1(awSpecList);
	} catch (Exception e) {
		System.out.println(e);
		//e.printStackTrace();
	}

}


}

