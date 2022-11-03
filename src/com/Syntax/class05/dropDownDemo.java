package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select select = new Select(dropDown);
        select.selectByIndex(5);
        Thread.sleep(1000);
        select.selectByVisibleText("Saturday");
        Thread.sleep(1000);
        select.selectByValue("Sunday");

        List<WebElement> options = select.getOptions();

        for(int i=0; i<options.size(); i++){
            WebElement option = options.get(i);
            String text = option.getText();
            if(text.equals("Friday")){
                select.selectByIndex(i);
            }
        }
        driver.quit();
    }
}
