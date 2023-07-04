package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Assignment8 {
    public static WebDriver m = null;

    public static void main(String[] args) {
        launch();
        navigate();
        login();
        minimize();
        // Createcustomer();
        // CreateProject();
        createTask();
        // Deleteproject();
        // Deletecustomer();
        // Logout();
        // Close();
    }

    private static void launch() {
        try {
            m = new ChromeDriver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void navigate() {
        try {
            m.get("http://localhost/login.do");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void login() {
        try {
            m.findElement(By.name("username")).sendKeys("admin");
            m.findElement(By.name("pwd")).sendKeys("manager");
            m.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void minimize() {
        try {
            m.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTask() {
        try {
            m.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
            Thread.sleep(2000);
            m.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
            Thread.sleep(2000);

            Thread.sleep(2000);
            m.findElement(By.xpath("/html/body/div[13]/div[2]")).click();
            Thread.sleep(5000);
            m.findElement(By.xpath("//*[@id=\"dropzoneClickableArea\"]")).click();
            Thread.sleep(9000);
            try {
                // Execute the AutoIt script
                Runtime.getRuntime().exec("F:\\SeleniumAutomation\\Sample.csv");
                Thread.sleep(9000);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Other methods omitted for brevity
}
