package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("Salom");
        driver.findElement(By.xpath("//input[@name ='pass']")).sendKeys("7777");
        driver.findElement(By.xpath("//*[@ value='1']")).click();
        driver.findElement(By.linkText("Sign up for an account.")).click();
        driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("Bobby");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Carlson");


    }
}
