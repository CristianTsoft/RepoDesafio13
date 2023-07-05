package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.TrenesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;


public class TestTrenes extends SeleniumTestBase {

    private HomePage homepage;
    private TrenesPage trenespage;

    @Test
    public void RT003 () {
        homepage = new HomePage(DriverFactory.getDriver());
        trenespage = new TrenesPage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irATrenes();
        trenespage.SoloIda();
        trenespage.Origen();

    }

}


   /*Escribir origen y destino
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        //Hacer click en el botòn de bùsqueda
        vuelospage.Busqueda();
        //Hacer click en el botòn "Mas barato"
        vuelosresults.MasBarato();*/