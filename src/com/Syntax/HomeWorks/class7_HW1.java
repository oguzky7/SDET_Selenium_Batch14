package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class7_HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String parentHandle = driver.getWindowHandle();
        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();

        WebElement privacyButton = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();
        String helpHandle = null;
        String privacyHandle =null;
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                helpHandle = driver.getWindowHandle();
                WebElement communityButton = driver.findElement(By.xpath("//a[text()='Community']"));
                communityButton.click();
            }else if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                privacyHandle = driver.getWindowHandle();
            }
        }
        driver.switchTo().window(parentHandle);
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("oguzky7");
        driver.switchTo().window(privacyHandle);
        Thread.sleep(1500);
        System.out.println(privacyHandle);
        System.out.println(helpHandle);
        System.out.println(parentHandle);
        driver.quit();
    }//oguzky7
}
