package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPage extends SeleniumWrapper {

    //Localizadores
    By btnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");

    By btnOrigen = By.xpath("//input[@id=':Rmhl6lalaqlql2mm:']");
    By btnDestino = By.xpath("//input[@id=':Rqhl6lalaqlql2mm:']");

    By btnFechaIda = By.xpath("//label[normalize-space()='Fecha de ida']");
  
    By btnFechaVuelta = By.xpath("//label[normalize-space()='Fecha de vuelta']");
  
    By btnPasajero = By.xpath("//label[normalize-space()='Pasajero']");

    By btnBusqueda = By.xpath("//button[@aria-label='Buscar']");


    public TrenesPage(WebDriver driver) {
        super(driver);
    }

    //Métodos

    public void SoloIda(){
        clickear(esperarPorElemento(btnSoloIda));
    }
    public void Origen(){
        clickear(esperarPorElemento(btnOrigen));
    }
    public void Destino(){
        clickear(esperarPorElemento(btnDestino));
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

    public void completarOrigenDestino(String origen,String destino){
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnOrigen));
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnDestino));
        esperarXSegundos(7000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(10000);

    }

}
