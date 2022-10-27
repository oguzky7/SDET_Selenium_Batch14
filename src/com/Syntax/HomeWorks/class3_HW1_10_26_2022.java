package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3_HW1_10_26_2022 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://syntaxprojects.com/");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
            Thread.sleep(100);
            driver.findElement(By.xpath("//a[@class ='list-group-item'][@href ='basic-first-form-demo.php']")).click();
            driver.findElement(By.xpath("//input[@id ='user-message']")).sendKeys("Hello World!");
            driver.findElement(By.xpath("//button[@onclick ='showInput();']")).click();
            Thread.sleep(1000);
            driver.quit();
            //oguzky7
        }
    }
