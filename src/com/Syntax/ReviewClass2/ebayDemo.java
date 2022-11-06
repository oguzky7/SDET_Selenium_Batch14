package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ebayDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(500);

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        Select selDD = new Select(dropDown);
        selDD.selectByValue("58058");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String title = driver.getTitle();
        if(title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("title verified");
        }

        System.out.println(title);

        Thread.sleep(1000);
        driver.quit();

    }
}