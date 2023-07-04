package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosFlex extends SeleniumWrapper {
    public VuelosFlex(WebDriver driver) {
        super(driver);
    }

    By btnFlex = By.xpath("//button[@class='Button-sc-1bbve8d-0 ghhXOt']");


    public void Flexible (){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnFlex));
        esperarXSegundos(5000);


    }

}
