package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosPage extends SeleniumWrapper {
    //Localizadores
    By btnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By btnOrigen = By.xpath("//input[@id=':R9d96jalalaqlql2mm:']");
    By btnDestino = By.xpath("//label[@id=':R9l96jalalaqlql2mm:-label']");
    By btnFechaIda = By.xpath("//label[normalize-space()='Fecha de ida']");
    By btnFechaVuelta = By.xpath("//label[normalize-space()='Fecha de vuelta']");
    By btnPasajero = By.xpath("//label[normalize-space()='Pasajero']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
    By btnMultidestino = By.xpath("//a[@class='d-n32sl1']");

    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    //Métodos

    public void SoloIda(){
        clickear(esperarPorElemento(btnSoloIda));

    }

    public void Destino(){
        clickear(esperarPorElemento(btnDestino));
    }
    public void Origen(){
        clickear(esperarPorElemento(btnOrigen));
    }
    public void FechaIda(){
        clickear(esperarPorElemento(btnFechaIda));
    }
    public void FechaVuelta(){
        clickear(esperarPorElemento(btnFechaVuelta));
    }
    public void Pasajero(){
        clickear(esperarPorElemento(btnPasajero));
    }
    public void Busqueda(){
        clickear(esperarPorElemento(btnBusqueda));
    }
    public void Multidestino(){
        clickear(esperarPorElemento(btnMultidestino));
    }

    public void completarOrigenDestino(String origen,String destino){

        agregarTexto((btnOrigen), origen);
        esperarXSegundos(5000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(5000);
    }

}




