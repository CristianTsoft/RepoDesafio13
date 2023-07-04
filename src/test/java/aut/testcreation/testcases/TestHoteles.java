package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.HotelesPage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class TestHoteles extends SeleniumTestBase {

    private HomePage homepage;
    private HotelesPage hotelesPage;
    @Test
    public void rh001 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesPage.Estrellas();
    }

    @Test
    public void rh002 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesPage.motel();
    }

    @Test
    public void rh003 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.huespedes("Roma,Italia");
    }

}