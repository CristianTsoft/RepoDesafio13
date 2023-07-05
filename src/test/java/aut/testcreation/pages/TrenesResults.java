package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    By btnResultado = By.xpath("(//div[@class='FullTripCard__PaymentContainer-sc-z8znd4-3 juamvE'])[1]");

    public TrenesResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnMasBarato));
    }
    public void Unresultado (){
        esperarXSegundos(8000);
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);
    }
}
