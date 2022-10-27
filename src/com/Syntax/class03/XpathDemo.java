package com.Syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("oguzky7@gmail.com");

        String forgetPassword = String.valueOf(driver.findElement(By.xpath("//a[text()='Forgot password?']")));
        WebElement a = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        a.click();
        Thread.sleep(500);
        driver.quit();
        //System.out.println(a);

    }
}
