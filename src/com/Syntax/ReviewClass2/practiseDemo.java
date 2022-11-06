package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practiseDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();
        Thread.sleep(500);
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("random");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("random2");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();
        Thread.sleep(500);

        WebElement errMessage = driver.findElement(By.xpath("//span[@id= 'spanMessage']"));
        String err = errMessage.getText();

        if(err.equals("Invalid credentials")){
            System.out.println("the correct error message is there. Verified");
        }else{
            System.out.println("not verified");
        }



        Thread.sleep(1000);
        driver.quit();

    }
}