package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxStaticDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","//Users//codewithazam//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"1 Adult");
        driver.findElement(By.id("divpaxinfo")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        driver.findElement(By.cssSelector("option[value='5']")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }else{
            System.out.println("Disabled");
            Assert.assertFalse(false);
        }
    }
}
