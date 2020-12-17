package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseYahoo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://yahoo.com");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("input#login-username")).sendKeys("Hello");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
        System.out.println(driver.findElement(By.id("username-error")).getText());
    }
}
