package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class NullCheck {


//		public int aMthod()
//		{
//			static int i;
//			i++;
//			return i;
//		}
		public static void main(String[] args)
		{



//------------------------------------

//			File f = null;
//		      File[] paths;
//
//		      try {
//
//		         // create new file
//		         f = new File("D:/temp1");
//
//		         // returns pathnames for files and directory
//		         paths = f.listFiles();
//
//		         // for each pathname in pathname array
//		         for(File path:paths) {
//
//		            // prints file and directory paths
//		            System.out.println(path);
//		         }
//
//		      } catch(Exception e) {
//
//		         // if any error occurs
//		         e.printStackTrace();
//		      }


			//------------------------------------
			HashMap <String,String> hm=new HashMap<>();
			hm.put("Brillio", "PUMA");
			String client=hm.get("Collabera");
			boolean b=client.equalsIgnoreCase("PUMA");
			if(b) System.out.println("Client is PUMA");
System.out.println("ERROR");
















		}







}


