package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static WebDriver b=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		Minimize();
		Createcustomer();
		CreateProject();
	    ModifyProject();
		DeleteProject();
	     Deletecustomer();
		Logout();
		Close();

	}
	private static void launch()
	{
		try {
			b=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try {
			b.get("http://localhost/login.do");
			Thread.sleep(2000);
			
		} catch (Exception e) {
			
		}
	}
	private static void login()
	{
		try {
			   b.findElement(By.name("username")).sendKeys("admin");
			   b.findElement(By.name("pwd")).sendKeys("manager");
			   b.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			   Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Minimize()
	{
		try {
			b.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			b.findElement(By.id("customerLightBox_nameField")).sendKeys("giri");
			b.findElement(By.xpath("//*[@id=\'customerLightBox_descriptionField\']")).sendKeys("kshdfbcbjhfegugbh");
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div/span")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			b.findElement(By.id("projectPopup_projectNameField")).sendKeys("EVSProject");
			Thread.sleep(3000);
			b.findElement(By.name("projectDescriptionField")).sendKeys("Industrial Project");
			Thread.sleep(3000);
			b.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifyProject()
	{
		try {
		
			 b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			 Thread.sleep(2000);
			 b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			 Thread.sleep(2000);
			 b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Institute Project");
			 Thread.sleep(2000);
			 b.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")).click();
			 Thread.sleep(4000);
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try {
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			b.findElement(By.id("projectPanel_deleteConfirm_submitBtn")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			b.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			b.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			b.findElement(By.linkText("Logout")).click();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Close()
	{
		try {
			b.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
