package com.test;

class Counter {
int count;
public synchronized void count(){
	count++;
}

}



public class Runnab   {

	public static void main(String[] args) throws InterruptedException {
Counter c=new Counter();
		Thread t1=new Thread (()->{

			for (int i=0;i<1000;i++){
				c.count();
			}
		});


		Thread t2=new Thread (()->{
			for (int i=0;i<1000;i++){
				c.count();
			}
		});



		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("counter"+c.count);
	}




}
