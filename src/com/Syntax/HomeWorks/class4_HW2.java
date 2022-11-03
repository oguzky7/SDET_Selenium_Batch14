package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4_HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userNameTab = driver.findElement(By.cssSelector("input#txtUsername"));
        userNameTab.sendKeys("Admin");
        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();

        String errorMessage = driver.findElement(By.cssSelector("span#spanMessage")).getText();

        if(errorMessage.equals("Password cannot be empty")){
            System.out.println("Error message has been displayed and it's : " + errorMessage );
        }
        driver.quit();
    }
}//oguzky7
