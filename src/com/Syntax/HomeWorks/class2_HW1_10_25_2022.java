package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2_HW1_10_25_2022 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Oguz");
        driver.findElement(By.id("customer.lastName")).sendKeys("Yildirim");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 9th ave and H st");
        driver.findElement(By.id("customer.address.city")).sendKeys("College Park");
        driver.findElement(By.id("customer.address.state")).sendKeys("MD");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20560");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("864 592 37 64");
        driver.findElement(By.id("customer.ssn")).sendKeys("864 52 37 64");
        driver.findElement(By.id("customer.username")).sendKeys("oguzky7");
        driver.findElement(By.id("customer.password")).sendKeys("1234546789");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456789");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
        driver.quit();
        //oguzky7
    }
}
