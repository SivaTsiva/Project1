package com.test;

import java.util.Date;

public class TestString1 {

	public static void main(String[] args) {


String abc="%%#03%";
String arg[]=abc.split("%");
for(String a:arg){
	if(a!=null){

		System.out.print(a);
	}
}
	}

}
