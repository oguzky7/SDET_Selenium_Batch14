package com.Syntax.ReviewClass3 ;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

        alert1.sendKeys("oguzky7");
        alert1.accept();

//        Alert alert3 = driver.switchTo().alert();
//        alert3.sendKeys("oguzky7");
//        alert3.accept();

        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        alert1.accept();

        Thread.sleep(2000 );
        driver.quit();
    }//oguzky7
}

