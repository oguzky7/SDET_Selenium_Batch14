package com.Syntax.ReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccountBtn = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
        createAccountBtn.click();

        Thread.sleep(500);

        WebElement day = driver.findElement(By.xpath("//select[@id = 'day']"));
        Select selDay = new Select(day);

        selDay.selectByIndex(4);
        Thread.sleep(500);
        selDay.selectByVisibleText("7");
        Thread.sleep(500);
        selDay.selectByValue("25");

        WebElement month = driver.findElement(By.xpath("//select[@id = 'month']"));
        Select selMonth = new Select(month);

        selMonth.selectByIndex(9);
        Thread.sleep(500);
        selMonth.selectByVisibleText("Aug");

        List<WebElement> Options = selMonth.getOptions();
        for(int i = 0; i<Options.size(); i++){
            String months = Options.get(i).getText();
            System.out.println(months);
        }


        Thread.sleep(1000);
        driver.quit();

    }
}