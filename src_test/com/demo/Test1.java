package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Test1 {

	
	@Test
	public void testTrue() throws Exception {
//		assert true;
		Assert.assertEquals(0, 0);
	}

}