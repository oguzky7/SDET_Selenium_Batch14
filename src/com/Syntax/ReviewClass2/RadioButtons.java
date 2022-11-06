package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name = 'ageGroup']"));

        for(WebElement radioBtn:radioBtns){
            String option = radioBtn.getAttribute("value");

            if(option.equalsIgnoreCase("15 - 50")){
                radioBtn.click();
            }
        }
            driver.quit();


    }
}