package com.test;

import java.util.*;
/**
 * @author siva.thumukuntla
 *
 */


interface AAA{
	 default void aaa(){
		 System.out.println("aaa");
	 }
}

interface BBB{
	default void aaa(){
		 System.out.println("BBB----aaa");
	 }
}


 public class LambdaExpressionExample implements AAA,BBB{


public  LambdaExpressionExample(){
System.out.println("LambdaExpressionExample");
	 }



    public static void main(String[] args) {
    	LambdaExpressionExample lpe=new LambdaExpressionExample();
    	lpe.aaa();
    	ArrayList<String> ar1=new ArrayList<String>();
    	ar1.add("A");
    	ar1.add("B");
    	ArrayList<String> ar2=new ArrayList<String>();
    	ar2.add("1");
    	ar2.add("2");
    	Set <String> set1=new HashSet<String>();
    	set1.addAll(ar2);
    	set1.addAll(ar1);
System.out.println(set1);
//ABC ab=()->{
//	System.out.println("Functional interface");
//};
//ABC obj=new AB();
//obj.display();

 }



	@Override
	public void aaa() {
System.out.println("dont no which method");
	}


 }


