package com.Syntax.class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(4200000);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(500);

        //Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();
        Thread.sleep(500);

        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();
        Thread.sleep(500);

        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();
        Thread.sleep(500);

        Alert promp1 = driver.switchTo().alert();
        promp1.sendKeys("oguzky7");
        Thread.sleep(500);
        promp1.accept();


        Thread.sleep(2500);
        driver.quit();
    }
}
