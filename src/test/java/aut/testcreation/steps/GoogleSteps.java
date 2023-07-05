package aut.testcreation.steps;


import aut.testcreation.pages.HomePage;
import aut.testplan.sprint.GoogleTestsAnaRunner;
import io.cucumber.java8.En;
import org.junit.jupiter.api.Assertions;


public class GoogleSteps extends GoogleTestsAnaRunner implements En{

    public GoogleSteps(){
<<<<<<< HEAD
       Before(2, GoogleTestsAnaRunner::setUp);
=======
<<<<<<< HEAD

=======
>>>>>>> 94eaadd6a653b74a5b6b4f52b998239358e1de28
        Before(2, GoogleTestsAnaRunner::setUp);
>>>>>>> 2cfe935d2ff39a9625b48a7e9d6279e9f94c515b
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
