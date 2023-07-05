package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.VuelosPage;
import aut.testcreation.pages.VuelosResults;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;



public class TestVuelos extends SeleniumTestBase {

    private HomePage homepage;
    private VuelosPage vuelospage;
    private VuelosResults vuelosresults;

    @Test
    public void RV001 () {
        homepage = new HomePage(DriverFactory.getDriver());
        vuelospage = new VuelosPage(homepage.getDriver());
        vuelosresults = new VuelosResults(homepage.getDriver());
        //Ingresar a rumbo.es
        homepage.navigateTo("https://www.rumbo.es");
        //Cerrar el cartel de cookies
        homepage.noCookies();
        //Hacer click en la pestaña "Vuelos"
        homepage.irAVuelos();
        //Escribir origen y destino
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        //Hacer click en el botòn de bùsqueda
        vuelospage.Busqueda();
        //Hacer click en el botòn "Mas barato"
        vuelosresults.MasBarato();
    }

}