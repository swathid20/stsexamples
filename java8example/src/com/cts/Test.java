package com.cts;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Add
{
   public int getSum(int a,int b);
   
}
@FunctionalInterface
interface Show
{
	public String getShow();
}
public class Test {

	public static void main(String[] args) {
		  Add add1 =( a,  b) ->  a+b ;
	        System.out.println(add1.getSum(5, 6));
	        Add add2=(a,b)->a*b;
	        System.out.println(add2.getSum(4, 4));
Show s1=()->"Lambda anonymous";
System.out.println(s1.getShow());
List<String> words =  Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");


System.out.println(" for each with lambda");

words.forEach( n -> System.out.println(n));



	}

}
