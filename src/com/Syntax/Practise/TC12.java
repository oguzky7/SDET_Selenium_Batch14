package com.Syntax.Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        //driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

        //boolean page = true;

        //List<WebElement> empList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int j = 0; j < 98; j++) {
            List<WebElement> empList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
            System.out.println(empList.size());
            for (int i = 1; i <= empList.size(); i++) {
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[2]")).click();
                //driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
                //empList.get(i).click();
                driver.findElement(By.xpath("//a[contains(@href,'JobDetails')]")).click();
                driver.findElement(By.xpath("//input[@id='btnTerminateEmployement']")).click();
                //System.out.println(driver.findElement(By.xpath("//input[@id='dialogConfirm']")).isEnabled());
                if(driver.findElement(By.xpath("//input[@id='dialogConfirm']")).isEnabled()){
                    System.out.println("Admin is able to terminate Employment");
                }else if(!driver.findElement(By.xpath("//input[@id='dialogConfirm']")).isEnabled()){
                    System.out.println("Admin is NOT ABLE TO TERMINATE EMPLOYMENT");
                }
                driver.findElement(By.xpath("//input[@class='btn reset']")).click();
                //driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
                driver.navigate().back();
                driver.navigate().back();
            }
            driver.findElement(By.xpath("//a[@class='tiptip' and text()='Next']")).click();
        }
    }
}
