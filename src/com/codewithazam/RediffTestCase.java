package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title*= 'Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("GoodMorning");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Baby");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    }
}
