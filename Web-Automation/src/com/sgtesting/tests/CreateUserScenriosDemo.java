package com.sgtesting.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateUserScenriosDemo {

	public static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();		
		Login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		LogOut();
		closeApplication();
	}

	private static void LaunchBrowser()
	{
		try {
			oBrowser= new ChromeDriver();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(10000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
					Thread.sleep(2000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("Demo@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("DemoUser1");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pwd");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("pwd");
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();			
				
			Thread.sleep(4000);
			
					

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void deleteUser()
	{ try {
		oBrowser.findElement(By.xpath("//span[text()='demo, demo']")).click();
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert =oBrowser.switchTo().alert();
		String content =oAlert.getText();
		Thread.sleep(3000);
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(3000);	
		
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}	
	
	
	private static void LogOut()
	{
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void closeApplication()
	{
		try {
			oBrowser.close();
			

		}catch (Exception e) {
			e.printStackTrace();
		}
	
}
}