package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HotelesPage extends SeleniumWrapper {

    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnUbicacion = By.xpath("//input[@id=':R8qjalalaqlql2mm:']");
    By btnFechaEntrada = By.xpath("//label[normalize-space()='Fecha de entrada']");
    By btnFechaSalida = By.xpath("//label[normalize-space()='Fecha de salida']");
    By btnPersona = By.xpath("//label[normalize-space()='Personas']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");

    By btnLista = By.xpath("//button[@class='sc-jPYHJC brbnpW']");

    By btnEstrellas = By.xpath("//div[@id='Pill-StarsContainer']");

    By checkEstrellas = By.xpath("//li[@id='exp_elem_hotel_stars_3']//*[name()='svg']//*[name()='rect' and contains(@width,'18')]");

    By btnAplicar = By.xpath("//div[@class='sc-eZYOHW khSA-dJ']");

    By btnAlojamiento = By.xpath("//div[@id='Pill-PropertyTypeContainer']");

    By btnHuespedes = By.xpath("//button[@class='d-1k0nsg5']");

    By btnSumar = By.xpath("//button[@aria-label='Aumentar el número de adultos']");


    public void completarBusqueda(String ciudad) throws InterruptedException {

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnUbicacion));
        Thread.sleep(5000);
        agregarTexto(esperarPorElemento(btnUbicacion), ciudad);
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnBusqueda));
        Thread.sleep(5000);
    }

    public void Estrellas() throws InterruptedException {
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnEstrellas));
        Thread.sleep(5000);
        clickear(esperarPorElemento(checkEstrellas));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAplicar));
        Thread.sleep(2000);
    }

    public void motel() throws InterruptedException {
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAlojamiento));
        Thread.sleep(5000);
    }

    public void huespedes(String lugar) throws InterruptedException {
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnUbicacion));
        Thread.sleep(5000);
        agregarTexto(esperarPorElemento(btnUbicacion), lugar);
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnHuespedes));
        Thread.sleep(5000);
        for (int i = 0; i < 8; i++) {
            clickear(esperarPorElemento(btnSumar));
        }
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnBusqueda));
        Thread.sleep(2000);
    }

}
