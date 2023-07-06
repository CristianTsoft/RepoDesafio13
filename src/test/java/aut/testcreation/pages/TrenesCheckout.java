package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesCheckout extends SeleniumWrapper {
    public TrenesCheckout (WebDriver driver) {
        super(driver);
    }
    //Localizadores

    By btnName = By.xpath("//input[@name='name']");
    By btnSurname = By.xpath("//input[@name='surname']");
    By btnEmail = By.xpath("//div[@data-testid='email']//input[@placeholder=' ']");
    By btnTelefono = By.xpath("//input[@name='phone']");
    By btnDirPostal = By.xpath("//input[@name='address']");
    By btnNumCalle = By.xpath("//input[@name='houseNumber']");
    By btnCodPostal = By.xpath("//input[@name='postCode']");
    By btnCiudad = By.xpath("//input[@name='city']");
    By checkSr = By.xpath("//label[@id='radio-groups.1.travellers.1.title-MALE-label']//span[@class='check']");
    By btnNameP = By.xpath("//input[@name='groups.1.travellers.1.name']");
    By btnSurnameP = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By btnDia = By.xpath("//span[contains(text(),'Día')]");
    By btnMes = By.xpath("//span[contains(text(),'Mes')]");
    By btnAnio = By.xpath("//span[contains(text(),'Año')]");

    By checkNoEquipaje = By.xpath("//div[contains(@class,'css-1xxax3')]//span[@class='check']");
    By btnSiguiente = By.xpath("//button[normalize-space()='Siguiente']");
    public void completarDatos (String name, String surname, String email , String telefono, String dirPostal, String numCalle , String codePost , String city , String nameP , String surnameP ,String dia , String mes , String anio){

        esperarXSegundos(30000);
        agregarTexto(esperarPorElemento(btnName), name);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnSurname), surname);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnEmail), email);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnTelefono), telefono);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnDirPostal), dirPostal);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnNumCalle), numCalle);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnCodPostal), codePost);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnCiudad), city);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnNameP), nameP);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnSurnameP), surnameP);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(checkSr));
        esperarXSegundos(5000);
        //agregarTexto(esperarPorElemento(btnDia), dia);
        esperarXSegundos(5000);
        //seleccionarComboBoxPortextoVisible(btnMes,mes);
        esperarXSegundos(5000);
        //agregarTexto(esperarPorElemento(btnAnio), anio);
        esperarXSegundos(5000);
        scrollingDownElement(esperarPorElemento(checkNoEquipaje));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(checkNoEquipaje));

    }
    public void botonSiguiente(){
        clickear(esperarPorElemento(btnSiguiente));
    }
}
