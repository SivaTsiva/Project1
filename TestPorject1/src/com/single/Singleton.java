package com.single;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc abc2=Abc.getInstance();
		Abc abc1=Abc.getInstance();
	}

}

class Abc{

	//eager looding
		//public static Abc obj=new Abc();
		static Abc obj;
		private Abc(){
	System.out.println("Instance crated");
		}

//		static synchronized Abc getInstance(){
//			if(obj==null){
//
//				obj=new Abc();
//			}
//			return obj;
//		}
		static  Abc getInstance(){ //double check locking

			if(obj==null){
				synchronized (Abc.class) {

					obj=new Abc();
	}
			}
			return obj;
		}

	}

