package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;


public class TestHoteles extends SeleniumTestBase {

    private HomePage homepage;
    @Test
    public void id001 () {
        homepage = new HomePage(DriverFactory.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
    }

}