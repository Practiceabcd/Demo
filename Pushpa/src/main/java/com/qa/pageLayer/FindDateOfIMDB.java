package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FindDateOfIMDB extends TestBase {
	
	public FindDateOfIMDB()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//==========obj epo==============
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")
	private WebElement release_date;
	
	
	
	
	
	//==========action method============

	public String getIMDBDate()
	{
		String imdbDate= release_date.getText();
		System.out.println(imdbDate);
		return imdbDate;
	}
	public String imdbDate;
	
	
	
	
	
	
	
	
	
	
}
