package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        List<WebElement> checkBxs = driver.findElements(By.xpath("//input[@name='color']"));

        for(WebElement checkBox:checkBxs){
            String option = checkBox.getAttribute("value");

            if(option.equalsIgnoreCase("yellow")){
                checkBox.click();
                break;
            }
        }
        Thread.sleep(2000);
        driver.quit();

    }
}