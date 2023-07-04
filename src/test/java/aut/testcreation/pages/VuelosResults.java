package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");

    By btnResultado = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='TransportPrice__TripCardPriceWrapper-sc-e3wayj-3 hwKeFo']");

    public VuelosResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnMasBarato));
    }

    public void Unresultado (){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);

    }



}
