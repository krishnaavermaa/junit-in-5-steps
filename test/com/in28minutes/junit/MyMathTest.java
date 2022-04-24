package com.in28minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath=new MyMath();
	
	@Test
	public void sum_with3no() {
		//fail("Not yet implemented");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
		System.out.println("test1");
		//System.out.println(result);
	}
	
	@Test
	public void sum_with1no() {
		//fail("Not yet implemented");
		assertEquals(3, myMath.sum(new int[] {3}));
		System.out.println("test2");
		//System.out.println(result);
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class level method");
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before class level method");
	}
	
	@Before
	public void before()
	{
		System.out.println("before");
	}
	
	@After
	public void after()
	{
		System.out.println("after");
	}

}
