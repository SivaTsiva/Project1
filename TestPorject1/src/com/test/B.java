package com.test;

public class B extends A {

		   void m1(){
			System.out.println("Class B m1()");
		}

		public static void main(String[] arg){

			B b=new B();
			b.m1();
			b.mA();

			A a=new A();
			a.m1();

			//B.m1();
			//A.m1();
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("Brillo");
			System.out.println(Thread.currentThread().getName());
}
		}
