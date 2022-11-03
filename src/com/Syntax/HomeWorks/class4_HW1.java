package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4_HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userNameTab = driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTab.sendKeys("Admin");
        WebElement passwordTab = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordTab.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();
        String message = driver.findElement(By.cssSelector("a#welcome")).getText();

        if(message.equals("Welcome Admin")){
            System.out.println("Message verified and it's : " + message );
        }
        driver.quit();
    }
}//oguzky7
