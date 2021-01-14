package stepdefinitions;

import Task.EnterDateForm;
import Task.OpenPage;
import UserInterfaces.Form;
import UserInterfaces.FormAddress;
import UserInterfaces.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepdefinitions{
        @Managed(driver = "chrome")
        private WebDriver herBrowser;
        private Actor user = Actor.named("usuario");
        private HomePage homePage;

        @Before
        @Given("^that user enter to page$")
        public void thatUserEnterToPage() {
                user.can(BrowseTheWeb.with(herBrowser));
                user.attemptsTo(OpenPage.at(homePage));
        }

        @When("^He enter all date of page register$")
        public void heEnterAllDateOfPageRegister() {
               user.attemptsTo(EnterDateForm.is());
                }



        @Then("^He waiting to be registered$")
        public void heWaitingToBeRegistered() {

        }

}
