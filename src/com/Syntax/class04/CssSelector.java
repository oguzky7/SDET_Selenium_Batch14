package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.cssSelector("input[placeholder *='Please enter']")); //contains
        text.sendKeys("oguzky7");
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showInp']")); //starts with
        button.click();
    }
}