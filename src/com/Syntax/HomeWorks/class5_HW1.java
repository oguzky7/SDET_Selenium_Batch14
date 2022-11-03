package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class class5_HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@role='button' and @rel='async']"));
        createNewAccount.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement mobileOrEmail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        firstName.sendKeys("First");
        lastName.sendKeys("Last");
        mobileOrEmail.sendKeys("syntaxtest@gmail.com");
        WebElement ReEmail = driver.findElement(By.xpath("//input[@type = 'text' and @name = 'reg_email_confirmation__']"));
        ReEmail.sendKeys("syntaxtest@gmail.com");
        password.sendKeys("deneme");
        Select selMonth = new Select(month);
        Select selDay = new Select(day);
        Select selYear = new Select(year);
        selMonth.selectByVisibleText("Dec");
        selDay.selectByVisibleText("3");
        selYear.selectByVisibleText("2002");
        gender.click();
        Thread.sleep(2000);
        //driver.quit();
    }//oguzky7
}
