package com.test;

class MyThread extends Thread{
	public void start(){
		super.start();
		for(int i=0;i<10;i++){
		System.out.println("start-method k"+i);
		}
	}
public void run(){
	//super.start();
	for(int i=0;i<10;i++){

		System.out.println("run-method"+i);
	}
}
}
public class Threada1 {

	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
		for(int j=0;j<10;j++){
		System.out.println("main -method j"+j);
		}
	}

}
