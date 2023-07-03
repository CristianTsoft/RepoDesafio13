package framework.testing.steps;

import framework.engine.bdd.CucumberBaseTestsAnaRunner;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;

public class FrameworkSteps extends CucumberBaseTestsAnaRunner implements En {

    public FrameworkSteps(){

        Before(1, CucumberBaseTestsAnaRunner::setUp);
        After(CucumberBaseTestsAnaRunner::tearDown);

        Given("que quiero que se ejecute correctamente este test", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        When("coloco assertTrue\\(true)", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("el test se ejecuto ok, para validar la correcta ejecucion de cucumber en el framework", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });


    }

}
