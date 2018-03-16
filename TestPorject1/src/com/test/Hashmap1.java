package com.test;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,String > hs=new HashMap<String,String>();
for(int i=0;i<6;i++){
	hs.put(i+"a", i+"c");
}
System.out.println(hs);
hs.put("2a", "siva");
System.out.println(hs.get("2a"));


	}

}
