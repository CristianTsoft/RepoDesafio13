package aut.testcreation.testcases;

import aut.testcreation.pages.Homapage;
import framework.engine.selenium.SeleniumTestsAnaBase;

public class atc01_POM extends SeleniumTestsAnaBase {

    Homapage googleHomePage;
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
