package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multidestino extends SeleniumWrapper {

    public Multidestino(WebDriver driver) {
        super(driver);
    }

    By btnDestino1 = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By btnDestino2 = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");

    By btnOpcionDestino = By.xpath("//div[contains(text(),'Madrid, España')]");
    By btnAñadirDestino = By.xpath("//div[contains(text(),'Añadir destino')]");

    By btnBuscar = By.xpath("//div[contains(text(),'Buscar')]");
    By locatorNoCookies = By.xpath("//button[@id='cookies_accept']//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 fgxWQF']");
    By btnPasajeros = By.xpath("//body/div[@id='react-view']/div[@class='MainViewstyled__Container-sc-17vqwtc-0 fdeVjQ']/div[@id='SearchFormStickyBoundary']/div[@class='Box__StyledBox-sc-bvm5o6-0 iRlSkf']/div[@class='Box__StyledBox-sc-bvm5o6-0 hkCYyV']/div[@class='Stack__StyledStack-sc-53pobq-0 eQfZlS']/div[@class='Stack__StyledStack-sc-53pobq-0 lbIWRK']/div[@class='PassengersAndBagsFieldstyled__StyledPassengersField-sc-kasop6-0 jIWfvr']/div[@class='Popover__StyledPopoverChild-sc-te0bas-0 cLKCiR']/div[@class='ButtonWrapsstyled__ButtonTabletWrap-sc-zf781k-0 cCMLcD']/button[@type='button']/div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 cTwcGp']/div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 NRXsW']/div[1]");
    By btnAñadirPasajero = By.xpath("//div[@data-test='PassengersRow-adults']//button[@aria-label='increment']//div[@class='ButtonPrimitiveIconContainer__StyledButtonPrimitiveIconContainer-sc-1bqiptv-0 fWaFsS']//*[name()='svg']");
    By btnConfirmar = By.xpath("//button[@class='ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 sKVkT']//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 fgxWQF']");
    By btnReservar = By.xpath("(//a[@class=\"ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 cbhdeA\"])[1]");
    By btnNombre1 = By.xpath("//input[@id='1-65']");
    By btnApellido1 = By.xpath("//input[@id='1-66']");
    By btnNacionalidad1 = By.xpath("//select[@id='1-67']");
    By btnSexo1 = By.xpath("//select[@id='1-68']");
    By diaDeNacimiento1 = By.name("//input[@id='1-71']");
    By mesDeNacimiento1 = By.xpath("//select[@id='1-72']");
    By anioDeNacimiento1 = By.xpath("//input[@id='1-73']");
    By DNI1 = By.xpath("//input[@id='1-74']");
    By SinCaducidad1 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/fieldset[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]/div[2]/span[1]");
    By SinEquipaje1 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/label[1]/div[2]/span[1]");
    By SinSeguro1 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[3]/div[1]/label[1]/div[2]/span[1]/div[1]/div[1]/div[1]/p[1]");
    By btnNombre2 = By.xpath("//input[@id='1-84']");
    By btnApellido2 = By.xpath("//input[@id='1-85']");
    By btnNacionalidad2 = By.xpath("//select[@id='1-86']");
    By btnSexo2 = By.xpath("//select[@id='1-87']");
    By diaDeNacimiento2 = By.name("(//input[@name='birthDay'])[1]");
    By mesDeNacimiento2 = By.xpath("(//input[@name='birthMonth'])[1]");
    By anioDeNacimiento2 = By.xpath("//input[@name='birthYear'])[1]");
    By DNI2 = By.xpath("//input[@id='1-93']");
    By SinCaducidad2 = By.xpath("//div[@class='BookingPage__BookingPageWrapper-sc-14hne6m-0 jGXxiV Reservation']//div[2]//div[1]//div[2]//div[1]//form[1]//fieldset[1]//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//label[1]//div[2]//span[1]");
    By SinEquipaje2 = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/label[1]/div[2]/span[1]");
    By SinSeguro2 = By.xpath("//label[@class='Radio__StyledLabel-sc-1e6hy4x-6 vvZYY']//p[@class='Text__StyledText-sc-1dj99rd-0 gDJoRh'][normalize-space()='Sin seguro']");
    By btnEmail = By.xpath("//input[@id='1-40']");
    By btnTelefono = By.xpath("//input[@id='1-44']");
    By btnContinuar = By.xpath("//button[@class='ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 hEDNte']");
    public void CambiarVentana() {
        String ventanaActual = driver.getWindowHandle();
        System.out.println("ID de la ventana actual: " + ventanaActual);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void CompletarMultidestino() {
        CambiarVentana();
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDestino1));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOpcionDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnAñadirDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDestino2));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOpcionDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBuscar));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(locatorNoCookies));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnPasajeros));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnAñadirPasajero));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnConfirmar));
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnReservar));
        esperarXSegundos(10000);
    }

    public void Pasajero1(String nombre, String apellido, String nacionalidad, String sexo, String dia, String anio, String dni) {
        agregarTexto(esperarPorElemento(btnNombre1), nombre);
        agregarTexto(esperarPorElemento(btnApellido1), apellido);
        seleccionarComboBoxPortextoVisible(btnNacionalidad1, nacionalidad);
        seleccionarComboBoxPortextoVisible(btnSexo1, sexo);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(diaDeNacimiento1), dia);
        esperarXSegundos(5000);
        seleccionarComboBoxPortextoVisible(mesDeNacimiento1, "Agosto");
        esperarXSegundos(2000);
        agregarTexto(esperarPorElemento(anioDeNacimiento1), anio);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(DNI1), dni);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(SinCaducidad1));
        clickear(esperarPorElemento(SinEquipaje1));
        clickear(esperarPorElemento(SinSeguro1));
    }
    public void Pasajero2(String nombre, String apellido, String nacionalidad, String sexo, String dni) {
        agregarTexto(esperarPorElemento(btnNombre2), nombre);
        agregarTexto(esperarPorElemento(btnApellido2), apellido);
        seleccionarComboBoxPortextoVisible(btnNacionalidad2, nacionalidad);
        seleccionarComboBoxPortextoVisible(btnSexo2, sexo);
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(DNI2), dni);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(SinCaducidad2));
        clickear(esperarPorElemento(SinEquipaje2));
        clickear(esperarPorElemento(SinSeguro2));
    }
    public void DatosContacto(String email, String telefono) {
        agregarTexto(esperarPorElemento(btnEmail), email);
        agregarTexto(esperarPorElemento(btnTelefono), telefono);
        clickear(esperarPorElemento(btnContinuar));
        esperarXSegundos(10000);
    }
}

