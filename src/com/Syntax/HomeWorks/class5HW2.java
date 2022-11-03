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
        WebElement AllCategories = driver.findElement(By.xpath("//select[@id ='gh-cat']"));
        Select sel = new Select(AllCategories);
        List<WebElement> options = sel.getOptions();
        for (WebElement category : options) {
            String value = category.getText();
            System.out.println(value);

        }
        sel.selectByVisibleText("Computers/Tablets & Networking");

        System.out.println("****************************************************");
                driver.findElement(By.xpath("//input[@type ='submit']")).click();
        String title = driver.getTitle();
        System.out.println("Title : " +title);
        if (title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
            System.out.println("Title verified");
        }else{
            System.out.println("no");
        }
        driver.quit();
    }//oguzky7
}
