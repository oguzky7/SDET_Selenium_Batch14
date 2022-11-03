package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select sel = new Select(DD);

        sel.selectByIndex(3);
        sel.selectByVisibleText("Texas");
        Thread.sleep(500);
        sel.deselectByIndex(3);

        List<WebElement> options = sel.getOptions();
        for(int i=0; i<options.size(); i++){
            sel.selectByIndex(i);
        }
        Thread.sleep(750);
        sel.deselectAll();

        //How can you check if the dropDown is multi select or not? or not using selenium at all?
        boolean multiSelect = sel.isMultiple();
        System.out.println(multiSelect);


        Thread.sleep(2000);
        driver.quit();
    }
}