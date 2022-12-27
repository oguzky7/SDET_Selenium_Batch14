package com.Syntax.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyClockOut {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Process has began");
        Thread.sleep(1800000);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://timeclock.winklerpool.com/mymitc/2/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class ='drop-btn-topmenu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id ='uname']")).sendKeys("4564");
        driver.findElement(By.xpath("//input[@id ='PW']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type ='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@href, 'Clock')]")).click();
        //Thread.sleep(1000);
        //WebElement options = driver.findElement(By.xpath("//select[contains(@onchange, 'check')]"));
        //Select selClockOut = new Select(options);
        //Thread.sleep(1000);
        //selClockOut.selectByVisibleText("03287 - Atrium @ Metro West"); // 03287 - Atrium @ Metro West
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@type= 'submit' and @id='Bco']")).click();
        Thread.sleep(2000);
        System.out.println("Clocked out");
        driver.quit();


    }
}
