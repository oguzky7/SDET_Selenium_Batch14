package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class class5HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        List<WebElement> ebayLinks = driver.findElements(By.className("scnd"));
        for (WebElement ebayLink : ebayLinks) {
            String link = ebayLink.getAttribute("href");
            System.out.println(link);
        }
        driver.get(driver.findElement(By.xpath("//a[contains(@href, 'Computer') and @class = 'scnd']")).getAttribute("href"));
        driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("Title verified");
        }else{
            System.out.println("no");
        }
        driver.quit();
    }//oguzky7
}