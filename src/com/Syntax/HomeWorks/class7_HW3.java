package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class class7_HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String parentHandle = driver.getWindowHandle();
        WebElement startButton = driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println("The text is : "+welcomeMessage.getText()+"\n");
        System.out.println("The reason the text is empty even we put the implicit wait code is: ");
        System.out.println("It's not that selenium can't find the thread. Selenium finds the elements and takes the text");
        System.out.println("The problem is, text appears later. We need to use explicit wait in order to take that text");
        driver.quit();
    }//oguzky7
}
