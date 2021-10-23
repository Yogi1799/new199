package com.mph.testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestClass {
	@Test
	public void testAllAssertMethods()
	{
		String str1 = new String("Yogesh");
		String str2 = new String("Yogesh");
		String str3 =null;
		
		int val1=5;
		int val2=6;
		
		String[] arr1={"one","two","three"};
		String[] arr2={"one","two","three"};
		
		
		assertEquals(str1, str2);
		//assertSame(str1, str2);
		//assertNotSame(str1, str2);
		//assertTrue(val1<val2);
		//assertFalse(val1<val2);
		//assertNull(str3);
		//assertArrayEquals(arr1, arr2);
	}
	@Test
	public void testAllAraayMethods() {

		String[] arr1 = { "one", "two", "three" };
		String[] arr2 = { "one", "two", "three" };

		assertArrayEquals(arr1, arr2);

	}
	
	@Test
	public void testAllNumberMethods() {
		
		int val1 = 5;
		int val2 = 6;
		
		 assertTrue(val1>val2);		 	
	}
}
