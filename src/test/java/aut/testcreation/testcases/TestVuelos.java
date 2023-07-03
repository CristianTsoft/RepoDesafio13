package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;



public class TestVuelos extends SeleniumTestBase {

    private HomePage homepage;
    @Test
    public void RV001 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
        btnBusqueda.click();
        this.homepage.irAVuelos();

    }

    @Test
    public void RV002 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
    }

    @Test
    public void RV003 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
    }

    @Test
    public void RV004 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
    }

    @Test
    public void RV005 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
    }

    @Test
    public void RV006 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAVuelos();
    }

}