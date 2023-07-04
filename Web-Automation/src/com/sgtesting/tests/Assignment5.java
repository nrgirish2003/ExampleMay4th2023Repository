package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static WebDriver m=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		Createcustomer();
		CreateProject();
		Deleteproject();
		Deletecustomer();
		Logout();
		Close();
	}
	private static void launch()
	{
		try {
			m=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			m.get("http://localhost/login.do");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	private static void login()
	{
		try {
			   m.findElement(By.name("username")).sendKeys("admin");
			   m.findElement(By.name("pwd")).sendKeys("manager");
			   m.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			   Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try {
			m.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			m.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			m.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("giri1");
			
			Thread.sleep(2000);

			m.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("abcd");
			Thread.sleep(2000);

			m.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			m.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			m.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			Thread.sleep(2000);
			m.findElement(By.name("projectDescriptionField")).sendKeys("Water Purifier Project");
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteproject()
	{
		try {
			m.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			m.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			m.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			m.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			m.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			m.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
