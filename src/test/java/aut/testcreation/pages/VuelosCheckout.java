package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VuelosCheckout extends SeleniumWrapper {
    public VuelosCheckout(WebDriver driver) {
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

    By diaDeNacimiento = By.name("groups.1.travellers.1.dateOfBirth");
    By anioDeNacimiento = By.xpath("(//input[@data-testid='input-input'])[12]");

    By checkNoEquipaje = By.xpath("//div[contains(@class,'css-1xxax3')]//span[@class='check']");

    By btnNetx = By.xpath("//button[normalize-space()='Siguiente']");
    By mesDeNacimiento = By.xpath("(//button[@type='button'])[10]");
    By Mes = By.xpath("(//li[@tabindex='-1'])[2]");

    public void completarDatos (String name, String surname, String email , String telefono, String dirPostal, String numCalle , String codePost , String city , String nameP , String surnameP ,String dia , String anio){

        esperarXSegundos(5000);
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
        agregarTexto(esperarPorElemento(diaDeNacimiento), dia);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(mesDeNacimiento));
        esperarXSegundos(2000);
        clickear(esperarPorElemento(Mes));
        esperarXSegundos(2000);
        agregarTexto(esperarPorElemento(anioDeNacimiento), anio);
        esperarXSegundos(5000);
        scrollingDownElement(esperarPorElemento(checkNoEquipaje));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(checkNoEquipaje));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnNetx));
        esperarXSegundos(5000);

    }




}
