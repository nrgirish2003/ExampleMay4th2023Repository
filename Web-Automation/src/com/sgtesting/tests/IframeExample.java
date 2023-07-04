package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class IframeExample {
    public static WebDriver driver = null;

    public static void main(String[] args) {
        launch();
        navigate();
        iframe();
        launch2();
        navigate2();
        iframe2();
    }

    private static void launch() {
        try {
            driver = new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void launch2() {
        try {
            driver = new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void navigate() {
        try {
        	//example for 3 frames in one page
            driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void navigate2() {
        try {
        	//example for frame inside frame
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void iframe2() {
        try {
        	//1st iframe
        	driver.switchTo().frame("iframeResult");//switch to outer i frame
        	Thread.sleep(3000);
        	
        	driver.switchTo().frame(0);// swith to inner frame
        	Thread.sleep(3000);
        	System.out.println("Text Present inside the inner frame:"+ driver.findElement(By.xpath("//h1")).getText());
        	driver.switchTo().parentFrame();//go to parent frame/outer frame
        	String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
        	System.out.println("text present in outter frame :" +text);
        	
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void iframe() {
        try {
        	//1st iframe
        	driver.switchTo().frame("packageListFrame");//name of the frame
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
        	driver.switchTo().defaultContent();// go back to the main page
        	Thread.sleep(3000);
        	
        	//2nd  iframe
        	driver.switchTo().frame("packageFrame");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[13]/a/span")).click();
        	driver.switchTo().defaultContent();
        	Thread.sleep(3000);
        	
        	//3rd iframe
        	driver.switchTo().frame("classFrame");
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();
        	
        	Thread.sleep(3000); 	
        	
        	driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
