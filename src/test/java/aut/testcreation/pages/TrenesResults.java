package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    By btnResultado = By.xpath("(//div[@class='FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 knGmgC'])[2]");

    public TrenesResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnMasBarato));
    }
    public void SeleccionarResultado() {
        esperarXSegundos(5000);
    }
    public void Unresultado(){
        esperarXSegundos(8000);
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);
    }
}