package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		AdminLogin();
		minimizeFlyOutWindow();
		createUsers();
		LogoutAsAdmin();
		LoginAsUser1();
		LogoutAsUser1();
		LoginAsUser2();
		LogoutAsUser2();
		LoginAsUser3();
		LogoutAsUser3();
		AdminLogin();
		modifyPassword();
		LogoutAsAdmin();
		LoginAsUser1modified();
		LogoutAsUser1modified();
		LoginAsUser2modified();
		LogoutAsUser2modified();
		LoginAsUser3modified();
		LogoutAsUser3modified();
		AdminLogin();
		deleteUsers();
		LogoutAsAdmin();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
		oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void AdminLogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
			oBrowser.findElement(By.name("email")).sendKeys("User1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User11");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);	
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo2");
			oBrowser.findElement(By.name("email")).sendKeys("User2@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User22");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);	
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo3");
			oBrowser.findElement(By.name("email")).sendKeys("User3@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User33");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsAdmin()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginAsUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(9000);
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			
		}
	}
	private static void LogoutAsUser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginAsUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(9000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			
		}
	}
	
	private static void LogoutAsUser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginAsUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User33");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(9000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			
		}
	}
	
	private static void LogoutAsUser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyPassword()
	{
		try
		{
			//modify password for user1
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='demo1, User1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
			//modify password for user2
			oBrowser.findElement(By.xpath("//span[text()='demo2, User2']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
			//modify password for user3
			oBrowser.findElement(By.xpath("//span[text()='demo3, User3']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).clear();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser1modified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User11");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
			Thread.sleep(4000);;
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser1modified()
	{
		try
		{

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser2modified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User22");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser2modified()
	{
		try
		{

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LoginAsUser3modified()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User33");
			oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LogoutAsUser3modified()
	{
		try
		{

			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='demo1, User1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			Thread.sleep(3000);
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='demo2, User2']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(3000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert.getText();
			Thread.sleep(3000);
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//span[text()='demo3, User3']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert3=oBrowser.switchTo().alert();
			String content3=oAlert.getText();
			Thread.sleep(3000);
			System.out.println(content3);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
