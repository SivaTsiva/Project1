package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Prope1 {

	public static void main(String[] args) throws IOException {
Properties p=new Properties();
try {
	OutputStream ou=new FileOutputStream("xyz.properties");
	p.setProperty("url", "brillio");
	p.store(ou, null);
	//InputStream io=new FileInputStream("ABC.PROPERTIES");
	//p.load(io);
	//p.list(System.out);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
