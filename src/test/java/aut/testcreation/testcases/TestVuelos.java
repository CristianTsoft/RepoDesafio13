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
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        vuelospage.Busqueda();
        vuelosresults.MasBarato();
    }

}