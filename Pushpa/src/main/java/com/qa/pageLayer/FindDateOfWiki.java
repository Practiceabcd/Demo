package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;


public class FindDateOfWiki extends TestBase {
	
	public FindDateOfWiki()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//=========page repo=============
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	private WebElement dateOfWiki;
	
	
	
	
	//============action method===============
	public String getWikiDate()
	{
		String wikiDate=dateOfWiki.getText();
		System.out.println(wikiDate);
		//driver.navigate().back(); 
	return	wikiDate ;
		
		
	}
	public String wikiDate;
	public void backToImdb()
	{   String ao="ss";
		driver.navigate().back(); 
	}
	
	
	
	
	
	
	
	
	
}
