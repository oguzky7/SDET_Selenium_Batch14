package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        driver.manage().window().maximize();
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='Male' and @name='optradio']"));

        boolean displayStatus = maleRadioBtn.isDisplayed();
        System.out.println("The radio button is Displayed :" + displayStatus);

        boolean enableStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :" + enableStatus);

        boolean selectStatus  = maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :" + selectStatus);

        if (!selectStatus){
            maleRadioBtn.click();
        }
        selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :" + selectStatus);

        driver.quit();
    }
}