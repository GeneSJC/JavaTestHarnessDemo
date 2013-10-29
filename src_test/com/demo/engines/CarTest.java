package com.demo.engines;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CarTest
{

	@Test
	public void getEngineTypeTest() throws Exception
	{
		Car car1 = new Car();
		
		String expectedType = "Auto";
		
		Assert.assertEquals(car1.getEngineType(), expectedType);
	}

}