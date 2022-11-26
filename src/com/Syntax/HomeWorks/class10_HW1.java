package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class class10_HW1 {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

//        enter the username in the text box
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("admin");
//        enter the password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement recruteTab = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruteTab.click();

        WebElement firstCalender = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]"));
        firstCalender.click();

        WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(months);
        select.selectByVisibleText("Aug");
        List<WebElement> days = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar']/tbody/tr/td)"));
        for(WebElement day:days){
                String currentDate = day.getText();
                if(currentDate.equalsIgnoreCase("8")) {
                    day.click();
                }}
        driver.quit();
    }//oguzky7
    }
