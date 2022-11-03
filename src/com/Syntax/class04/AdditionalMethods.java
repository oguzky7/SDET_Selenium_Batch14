package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //driver.manage().window().maximize();
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));
        String text = btn.getText();
        System.out.println(text);

        String idValue = btn.getAttribute("id");
        System.out.println("The value of the attribute ide is: "+idValue);

        driver.quit();
    }
}
