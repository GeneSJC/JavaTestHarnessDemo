package com.demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.thoughtworks.selenium.SeleneseTestBase;

public class OnlineTest extends SeleneseTestBase
{
	private WebDriver driver;
	
	@Override
	@BeforeClass
	public void setUp()
	{
		driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_9);
	}
	
	
	@Test
	public void pageTitleGoogle()
	{
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals (pageTitle, "Google");
	}
	

	

}
