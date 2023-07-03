package aut.testcreation.testcases;

import aut.testcreation.pages.GoogleHomePage;
import framework.engine.selenium.SeleniumTestsAnaBase;

public class atc01_POM extends SeleniumTestsAnaBase {

    GoogleHomePage googleHomePage;
 /*
    @Test
    @Tag("regresion")
    void busquedaGoogle(){
        googleHomePage = new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.navegarAlHome();
        googleHomePage.buscarConBotonBuscar("Tsoft");
        Assertions.assertEquals("Tsoft - Buscar con Google",googleHomePage.getUrlTitle());
    }
  */
}
