package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VuelosResults extends SeleniumWrapper {
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    By btnResultado = By.xpath("(//div[@class='FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 knGmgC'])[2]");
    By btnOrigen = By.xpath("//input[@id=':R9d96jalalaqlql2mm:']");
    By btnDestino = By.xpath("//input[@id=':R9l96jalalaqlql2mm:']");
    By btnPasajeros = By.xpath("//span[normalize-space()='1 pasajero']");
    By btnSumar = By.xpath("//*[name()='path' and contains(@d,'M19 13H13V')]");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");

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
        esperarXSegundos(5000);
    }

    public void pasajesMaximos(String origen, String destino) throws InterruptedException {

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnOrigen));
        Thread.sleep(5000);
        agregarTexto(esperarPorElemento(btnOrigen), origen);
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnDestino));
        Thread.sleep(5000);
        agregarTexto(esperarPorElemento(btnDestino), destino);
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnPasajeros));
        Thread.sleep(5000);
        for (int i = 0; i < 8; i++) {
            clickear(esperarPorElemento(btnSumar));
        }
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnBusqueda));
        Thread.sleep(2000);

    }
}
