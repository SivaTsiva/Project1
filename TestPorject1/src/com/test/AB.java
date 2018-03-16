package com.test;

interface ABC{
	void display();
}
public class AB extends LambdaExpressionExample implements ABC
{

	 public AB(){
		 System.out.println("AB");
	 }
public void LambdaExpressionExample(){
System.out.println("LambdaExpressionExample-AB");
	 }

	 int a;

	 public void show(){
		 System.out.println("Class show");
		 System.out.println(a);
	 }
	@Override
	public void display() {
		System.out.println("Class display");
		 System.out.println(a);

	}

}
