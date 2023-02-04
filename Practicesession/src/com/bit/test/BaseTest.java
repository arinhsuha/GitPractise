package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	  
	  public void getResult() {
		System.setProperty("webdriver.chrome.driver","//Users/arinhassansuha/Downloads/chromedriver");
}
     ChromeDriver dr = new ChromeDriver();
     
     
     int a = 10;
	 double b= 2.5;
     
     
      public void multiply () {
	   System.out.println(a*b);
   }
     
     
      public void clickOnAnyElement(By locator) {
    	 
		dr.findElement(locator).click();
     }
		
      public void clickByXpath() {
    	  
    	   dr.findElement(By.xpath("")).click();
      }
	  
	  public void typeOnAnyElement(By locator) {
		   
		  
		dr.findElement(locator).sendKeys("");
		  
	  }
	  public void typeOnElementByCss() {
		  
		  dr.findElement(By.cssSelector("")).sendKeys("");
	  }
	  
	  
	  // num 6,7,11 I cant do..
	  //num 10 i dont know..
	  
	  
	  
	   public void getPageLink(By locator) {
		  
		dr.findElement(locator).click();
	  }
	  
	  
	   public void getPageLinkText(By locator) {
			
			String result= dr.findElement(locator).getText();
			System.out.println(result);
	  

	   }
	   
	   
	   public void TargetSignUp() {
		   
		   // BaseTest b= new BaseTest();
	   }
	   

	   

           public void VerifyAnyListOfElements(WebElement element,int number) {
	             
	         dr.findElements((By) element);
	         System.out.println(element);
}
	   

	}
	   
           	   
	   
	   
	   
	   
	   
	   
	   

