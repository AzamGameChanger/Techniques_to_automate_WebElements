package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxStaticDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        driver.findElement(By.cssSelector("option[value='5']")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

    }
}
