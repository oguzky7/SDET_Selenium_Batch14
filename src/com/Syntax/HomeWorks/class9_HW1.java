package com.Syntax.HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class class9_HW1 {

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

//        click on login button
            WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            loginButton.click();

            //Thread.sleep(1000);
            driver.findElement(By.xpath("//b[text()='PIM']")).click();
            driver.findElement(By.xpath("//a[contains(@id,'EmployeeL')]")).click();

//        check the checkBox that contains "screen saver" as a product
            List<WebElement> idColumn = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
//        traverse through the list

            for (int i = 0; i < idColumn.size(); i++) {
                String idNumber = idColumn.get(i).getText();

                if(idNumber.equalsIgnoreCase("45024A")){

                    int rowNumber = i + 1;
                    System.out.println("Row number of 45024A : "+rowNumber);

//              get the checbkbox on this row number and click it
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + rowNumber + "]/td[1]"));
                    checkBox.click();

                }

            }
            System.out.println("Checked");
            driver.quit();
        }

    }
