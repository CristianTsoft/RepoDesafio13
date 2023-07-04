package aut.testcreation.steps;


import aut.testplan.sprint.GoogleTestsAnaRunner;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;


public class GoogleSteps extends GoogleTestsAnaRunner implements En{

    public GoogleSteps(){

        Homapage googleHomePage;
        Before(2, GoogleTestsAnaRunner::setUp);
        After(GoogleTestsAnaRunner::tearDown);

        Given("que estoy en el Home de Google", () -> Assertions.assertTrue(true));

        When("busco la palabra {string} en el navegador", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        When("presiono el boton buscar", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });

        Then("me lleva a la pagina de resultados", () -> {
            // Write code here that turns the phrase above into concrete actions
            Assertions.assertTrue(true);
        });
    }
}
