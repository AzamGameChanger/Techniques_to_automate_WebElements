package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTraverse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http:yahoo.com");
        //google's search bar with parent-child traverse technique
        //driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Hello World");
        //google's image click with parent-child traverse technique
        //driver.findElement(By.xpath("//div[@class='gb_Ta gb_Fg gb_i gb_Eg gb_Hg gb_Zf']/div/div[2]/a")).click();
        //yahoo's search bar with parent-child traverse technique
        driver.findElement(By.xpath("//div[@class='_yb_1v8tx _yb_13m1i']/div/div[2]/form/input")).sendKeys("Wow that was a god one");
    }
}
