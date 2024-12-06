package com.qa.zone24x7.base;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver uiDriver;
    // constructor
    public BasePage(WebDriver driver){
        this.uiDriver = driver;

    }
}
