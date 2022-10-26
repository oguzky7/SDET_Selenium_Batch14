package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("kaan");
        driver.findElement(By.name("pass")).sendKeys("annen");
        //driver.findElement(By.name("login")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

    }
}
