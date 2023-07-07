package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrenesResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    By btnResultado = By.xpath("(//div[@class='FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 knGmgC'])[2]");
    By btnOrigen = By.xpath("//input[@aria-label='Origen']");
    By btnDestino = By.xpath("//input[@aria-label='Destino']");
    By btnPasajeros = By.xpath("//span[normalize-space()='1 pasajero']");
    By btnSumar = By.xpath("//*[name()='path' and contains(@d,'M19 13H13V')]");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
    By mensajeerror = By.cssSelector("//*[name()='path' and contains(@d,'M19 13H13V')]");
    public TrenesResults(WebDriver driver) {
        super(driver);
    }

    //Metodos
    public void MasBarato(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnMasBarato));
    }
    public void Unresultado(){
        esperarXSegundos(8000);
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);
    }

    public void pasajesMaximos(String origen, String destino) {

        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnOrigen));
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnDestino));
        esperarXSegundos(7000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnPasajeros));
        for (int i = 0; i < 4; i++) {
            clickear(esperarPorElemento(btnSumar));
        }
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(10000);
    }

    public void Mensaje(){
        /*
        driver.findElement(mensajeerror).isDisplayed();
        System.out.println("El elemento está visible.");
         */
    }

}