package com.Syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();

        String gmailHandle = driver.getWindowHandle();
        System.out.println(gmailHandle);
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("The current page under focus is :" + title);
                break;
            }
        }

        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        Thread.sleep(2500);
        driver.quit();
    }
}
