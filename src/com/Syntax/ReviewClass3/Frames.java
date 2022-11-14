package com.Syntax.ReviewClass3 ;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame1);
        driver.switchTo().frame(0);
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame2);

        WebElement dropDown =driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dropDown);
        sel.selectByIndex(1 );
        driver.switchTo().defaultContent();

        driver.switchTo().frame(frame1);

        driver.findElement(By.xpath("//input")).sendKeys("oguzky7 ");

        Thread.sleep(2000 );
        driver.quit();
    }//oguzky7
}

