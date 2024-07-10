package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com");
        driver.manage().window().maximize();
        WebElement loginPageButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        loginPageButton.click();
        WebElement LoginMail = driver.findElement(By.xpath("//input [@data-qa=\"login-email\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        LoginMail.sendKeys("mezoamer@test.com");
        WebElement LoginPassowrd = driver.findElement(By.xpath("//input [@data-qa=\"login-password\"]"));
        LoginPassowrd.sendKeys("mezo@123");
        //valedation step 1
        String URL = driver.getCurrentUrl();
        WebElement loginButton = driver.findElement(By.xpath("//button [@data-qa=\"login-button\"]"));
        loginButton.click();
        WebElement logoutButton = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
        String actualString = logoutButton.getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


       if (logoutButton.isEnabled()){
           System.out.println("pass");
        }
       else{
        System.out.println("fail");
        }
        }

        //driver.quit();


    }