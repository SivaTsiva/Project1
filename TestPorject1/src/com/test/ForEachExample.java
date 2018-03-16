package com.test;

import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ForEachExample {
public static void main(String[] args) {
//List<String> a=Arrays.asList("abc","xyz","pqr");
//
//a.forEach(System.out::println);
//
//List<Integer> ints=Arrays.asList(1,2,3,4,5);
//
//
////ints.forEach(System.out::println);
//
//
//
//
//Integer s=ints.stream().map((i)->i*2).reduce(0, (c,e)->c+e);
//
////Integer s1=s.map((i)->i*2).reduce(0, (c,e)->c+e);
//
//
////int result12=(int) s1.reduce(0, (c,e)->c+e);
//
//System.out.println(s);


//	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//
//	System.out.println(strings);
//	System.out.println(filtered);


	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	//get list of unique squares
	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

System.out.println(numbers);
System.out.println(squaresList);
}
}