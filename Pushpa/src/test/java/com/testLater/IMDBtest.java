package com.testLater;



import org.testng.annotations.Test;

import com.qa.pageLayer.FindDateOfIMDB;
import com.qa.pageLayer.FindDateOfWiki;
import com.qa.testBase.TestBase;


public class IMDBtest extends TestBase{
	FindDateOfWiki dw;
	FindDateOfIMDB dt;
	@Test
	
	public void testIMDB() throws InterruptedException
	{
    	 dw= new FindDateOfWiki();
		Thread.sleep(2000);
		dw.getWikiDate();
		Thread.sleep(2000);
		String av=dw.getWikiDate();
		Thread.sleep(2000);
		
		dw.backToImdb();

      dt= new FindDateOfIMDB();
	  Thread.sleep(2000);
	  dt.getIMDBDate();
	  String aw=dt.getIMDBDate();
	 
	  
	  if(aw.equals(av))
		{
		  System.out.println("Release date of pushpa matching");
		}
	  else
	  {
		  System.out.println("Release date of pushpa is not matching");
	  }
	}
	
	
	
	
		
	

}
	
	

 



