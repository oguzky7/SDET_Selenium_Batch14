package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
//      get all the links i.e anchor tags from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
//      print size of the list
        System.out.println("The size of the list is : " + ebayLinks.size());
        for(WebElement ebayLink :ebayLinks){
//      extracting the value of attribute href cause it contains the link embedded in the WebElement
        String link = ebayLink.getAttribute("href");
//      print the link
        System.out.println(link);


        driver.quit();
        }
    }
}
