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

    By checkNoEquipaje = By.xpath("//div[contains(@class,'css-1xxax3')]//span[@class='check']");
    By btnSiguiente = By.xpath("//button[normalize-space()='Siguiente']");
    By diaDeNacimiento = By.name("groups.1.travellers.1.dateOfBirth");
    By mesDeNacimiento = By.xpath("//button[@data-testid='groups.1.travellers.1.dateOfBirth_month']");
    By Mes = By.xpath("(//li[@data-testid='menu-item'])[2]");
    By anioDeNacimiento = By.xpath("(//input[@data-testid='input-input'])[8]");
    By btnNetx = By.xpath("//button[normalize-space()='Siguiente']");
    By btnNoGracias = By.xpath("//label[@class='insurance__noThanks-radio-label']//span[@class='check']");
    By btnSinAsiento = By.xpath("//button[contains(text(),'Continuar sin elegir asiento')]");
    By btnTitular = By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By btnMesCad = By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]");
    By btnAnioCad = By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[2]");
    By btnCVV = By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By btnReservarAhora = By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[11]/div[1]/div[1]/div[1]/div[1]/button[1]");

    By locatorIdentificacion = By.xpath("//button[@data-testid='groups.1.travellers.1.documentType']");
    By locatorIdent2 = By.xpath("(//span[@class='MenuItemstyles__Label-sc-fguzn7-1 crpsZL'])[2]");
    By numDni = By.xpath("(//label[@class='FormFieldstyles__InnerWrapper-sc-1pt5zgp-3 fUwskt'])[9]");
    public void CambiarVentana(){
        String ventanaActual = driver.getWindowHandle();
        System.out.println("ID de la ventana actual: " + ventanaActual);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }




    public void completarDatos (String name, String surname, String email , String telefono, String nameP , String surnameP ,String dia , String anio , String dni){

        esperarXSegundos(2000);
        CambiarVentana();
        agregarTexto(esperarPorElemento(btnName), name);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnSurname), surname);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnEmail), email);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnTelefono), telefono);
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


        clickear(esperarPorElemento(locatorIdentificacion));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(locatorIdent2));
        esperarXSegundos(5000);

        clickear(esperarPorElemento(numDni));
        esperarXSegundos(5000);
        //agregarTexto(esperarPorElemento(numDni),dni);
        esperarXSegundos(5000);

        scrollingDownElement(esperarPorElemento(checkNoEquipaje));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(checkNoEquipaje));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnNetx));
        esperarXSegundos(5000);

    }
    public void EquipajeyServicios(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnNoGracias));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnNetx));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnSinAsiento));
        esperarXSegundos(5000);
    }

    public void Facturacion(String titular, String mesCaducidad, String anioCaducidad, String CVV){
        EquipajeyServicios();
        agregarTexto(esperarPorElemento(btnTitular), titular);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnMesCad), mesCaducidad);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnAnioCad), anioCaducidad);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnCVV), CVV);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnReservarAhora));
        esperarXSegundos(5000);

    }


}
