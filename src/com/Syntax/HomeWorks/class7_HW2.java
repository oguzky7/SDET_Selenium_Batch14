package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class7_HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement getNewUserButton = driver.findElement(By.xpath("//button[text()='Get New User']"));
        getNewUserButton.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]"));
        WebElement lastName = driver.findElement(By.xpath("//p[contains(text(),'Last Name :')]"));

        System.out.println(firstName.getText()+"\n"+lastName.getText());
        driver.quit();
    }//oguzky7
}
