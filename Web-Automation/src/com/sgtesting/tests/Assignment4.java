package com.sgtesting.tests;

import javax.naming.spi.ObjectFactoryBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
     public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		login();
		Minimize();
		CreateCustomer();
		Modify();
		Deletecustomer();
		logout();
		close();
	
	}
	public static void LaunchBrowser() 
	{
		try {
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void Navigate()
	{
	  try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}	
	
	}
	public static void login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void Minimize()
	{
		try {
			 oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			   Thread.sleep(2000);

			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void CreateCustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("giri1");
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("abcd");
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);			

		} catch (Exception e) {
			e.printStackTrace();
	
		}
	}
	private static void Modify()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("nhgytrgfa");
			  Thread.sleep(2000);
			  oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[1]")).click();
			  Thread.sleep(2000);
			
		} catch (Exception e) {
	        e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
	       e.printStackTrace();
		}
	}
		private static void logout()
		{
			try {
				oBrowser.findElement(By.id("logoutlink")).click();
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		private static void close()
		{
			try {
			oBrowser.close();
			Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}



