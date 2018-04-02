package com.addition;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMainAddition {

	/*@Test
	
	public void test() {
		fail("Not yet implemented");
	}*/
@Test
public void testadd()
{
	System.out.println("Addition unit test");
	MainAddition ma=new MainAddition();
	int num1=18;
	int num2=12;
	int actual=ma.add(num1,num2);
	assertEquals(30, actual);
}
}
