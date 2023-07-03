package aut.testcreation.pages;

import org.openqa.selenium.By;

public class TrenesPage {
    //Localizadores
    By btnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By btnOrigen = By.xpath("//label[@id=':Rmhl6lalaqlql2mm:-label']");
    By btnDestino = By.xpath("//label[@id=':Rqhl6lalaqlql2mm:-label']");
    By btnFechaIda = By.xpath("//label[normalize-space()='Fecha de ida']");
    By btnFechaVuelta = By.xpath("//label[normalize-space()='Fecha de vuelta']");
    By btnPasajero = By.xpath("//label[normalize-space()='Pasajero']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
}
