package com.sgtesting.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginLogout {

	public static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();		
		Login();
		minimizeFlyOutWindow();
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