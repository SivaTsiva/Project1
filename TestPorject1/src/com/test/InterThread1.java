package com.test;


class Q{
	int num;
	boolean value=false;
	public synchronized void put(int num){
		while(value){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num=num;
		System.out.println("Put Item"+num);
		value=true;
		notify();
	}
	public synchronized void get(){
		while(!value){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Get item"+num);
		value=false;
		notify();
	}
}

class Producer implements Runnable{

	Q q;

	public Producer(Q q) {
		this.q = q;
		Thread pro=new Thread (this,"Producer");
		pro.start();
	}

	@Override
	public void run() {

int i=0;
while(true){
	q.put(i++);
	try{
		Thread.sleep(100);
	}
	catch(Exception e){

	}

	if(q.num==20){
		return;
	}
}
	}

}
class Consumer implements Runnable{
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread con=new Thread (this,"Consumer");
		con.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true){
			q.get();
			try{
				Thread.sleep(100);
			}
			catch(Exception e){

			}
			if(q.num==19){
				return;
			}
		}
	}

}
public class InterThread1 {

	public static void main(String[] args) {
Q q=new Q();
new Producer(q);
new Consumer(q);
	}

}
