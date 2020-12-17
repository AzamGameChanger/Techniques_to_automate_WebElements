package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.cssSelector("#Login")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());



    }
}
