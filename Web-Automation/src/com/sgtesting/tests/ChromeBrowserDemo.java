package com.sgtesting.tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserDemo {

	public static  WebDriver oBrowser=null;
	public static void main(String[] args) {
		//LaunchBrowser();
		//navigate();
		//closeApplication();
		LaunchFirefoxBrowser();
		navigate2();
		closeApplication2();

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
	private static void LaunchFirefoxBrowser()
	{
		try {
			oBrowser= new FirefoxDriver();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate2()
	{
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void closeApplication2()
	{
		try {
			oBrowser.close();
			

		}catch (Exception e) {
			e.printStackTrace();
		}
	
}
}