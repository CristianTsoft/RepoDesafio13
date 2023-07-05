package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VuelosResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");

    //By btnResultado = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[5]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]");
    By btnResultado = By.cssSelector("div[class='trip-collection-view__trips-container-top'] div[class='FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 knGmgC']");




    public VuelosResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnMasBarato));
    }

    public void Unresultado (){
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);

    }



}
