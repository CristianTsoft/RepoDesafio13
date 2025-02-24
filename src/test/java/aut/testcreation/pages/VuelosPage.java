package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosPage extends SeleniumWrapper {
    //Localizadores
    By btnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By btnOrigen = By.xpath("//input[@aria-label='Origen']");
    By btnDestino = By.xpath("//input[@aria-label='Destino']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
    By btnMultidestino = By.xpath("//a[@class='d-n32sl1']");


    public VuelosPage(WebDriver driver) {
        super(driver);
    }

    //Métodos

    public void completarOrigenDestino(String origen,String destino){

        agregarTexto((btnOrigen), origen);
        esperarXSegundos(5000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(5000);
    }

    public void BusquedaSoloIda(String origen , String destino){

        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOrigen));
        esperarXSegundos(5000);
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(5000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnSoloIda));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(5000);

    }

    public void irAMultidestino() {
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnMultidestino));
    }

}




