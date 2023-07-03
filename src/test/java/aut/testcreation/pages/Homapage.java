package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homapage extends SeleniumWrapper {

    public Homapage(WebDriver driver) {
        super(driver);
    }

    //locators

    By btnVuelos = By.xpath("//span[contains(text(),'Vuelos')]");


}
