package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        /*
        driver.findElement(By.cssSelector("#username")).sendKeys("Hello");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Send");
        driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
        System.out.println(driver.findElement(By.cssSelector("[id='error']")).getText());
        */

    }
}
