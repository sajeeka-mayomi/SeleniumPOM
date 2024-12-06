package com.qa.zone24x7.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildTest extends Parent{

/*    public  void commonSteps(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
    }*/

    @Test
    public void testOne(){

       commonSteps();
        WebElement selectDropdownOption = driver.findElement(By.xpath("//a[normalize-space()='Dropdown']"));
        selectDropdownOption.click();

        WebElement checkHeadingTitle = driver.findElement(By.xpath(" //h3[normalize-space()='Dropdown List']"));
        Assert.assertEquals(checkHeadingTitle.getText(),"Dropdown List","Verify Drop down Page");


    }

    @Test
    public void testTwo(){

        commonSteps();

        WebElement selectDropdownOption = driver.findElement(By.xpath("//a[normalize-space()='Dropdown']"));
        selectDropdownOption.click();

        WebElement checkHeadingTitle = driver.findElement(By.xpath(" //h3[normalize-space()='Dropdown List']"));
        Assert.assertEquals(checkHeadingTitle.getText(),"Dropdown List","Verify Drop down Page");


    }
}
