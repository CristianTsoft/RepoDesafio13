package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesPage extends SeleniumWrapper {

    //Localizadores
    By btnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By btnOrigen = By.xpath("//input[@aria-label='Origen']");
    By btnDestino = By.xpath("//input[@aria-label='Destino']");
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

    public void completarOrigenDestino(String origen,String destino){
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnOrigen));
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnDestino));
        esperarXSegundos(7000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(10000);

    }
    public void BusquedaSoloIda(String origen , String destino){

        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnSoloIda));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOrigen));
        esperarXSegundos(5000);
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDestino));
        esperarXSegundos(5000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(5000);

    }
}
