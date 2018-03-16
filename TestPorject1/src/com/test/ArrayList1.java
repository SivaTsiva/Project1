package com.test;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;


public class ArrayList1 {

	public static void main(String[] args) {
String str=new String ("Upper Material Section-Upper Material Section-/Newcastle sock packaging without OPC seasonal callout 2018/2019+Newcastle sock packaging without OPC seasonal callout 2018/2019 /Field Name-Field Name-Field Name ");

String[] splitStr = str.split("/");
List<String> fieldValues = Arrays.asList(splitStr);
int listSize = fieldValues.size();
String firstPart = fieldValues.get(0);
String lastPart = fieldValues.get(listSize - 1);
int firstPartLen=firstPart.length();
int lastPartLen=lastPart.length();
String mainString=str.substring(str.indexOf("/")+1, str.lastIndexOf("/"));
//int mainStringLen=mainString.length();
List l=new ArrayList<>();
//int preFixSuFixLen=firstPartLen+lastPartLen;

int requiredMainStrLen=118-(firstPartLen+lastPartLen);
String requiredMainStr=mainString.substring(0, requiredMainStrLen);

 requiredMainStr = firstPart+"/"+requiredMainStr+"/"+lastPart;


 System.out.println(str);

System.out.println(firstPart+firstPartLen);
System.out.println(lastPart+lastPartLen);

System.out.println(mainString);
System.out.println(mainString.length());


System.out.println(requiredMainStr);
System.out.println(requiredMainStr.length());


List<String> productsList = new ArrayList<String>();  
        //Adding Products  
        productsList.add( "HP Laptop");  
        productsList.add( "Dell Laptop");  

        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  




	}

}
