package stepsdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.NumberOf;
import questions.TheNumberOf;
import tasks.Create;
import tasks.Ship;
import userinterface.DemoSerenityUserInterface;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoSerenityStepsDefinition {
    @Managed(driver="chrome")
    private WebDriver chromeBrowser;
    @Before
    public void configuracionInicial() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("user").can(BrowseTheWeb.with(chromeBrowser));
    }
    @Given("^user credentials are in the page$")
    public void userCredentialsAreInThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(new DemoSerenityUserInterface()));
    }

    @When("^user creates a new order$")
    public void userCreatesANewOrder() {
        theActorInTheSpotlight().attemptsTo(Create.anOrder());
    }

    @Given("^ship the order$")
    public void shipTheOrder() {
        theActorInTheSpotlight().attemptsTo(Ship.anOrder());
    }

    @Then("^the number of orders should not change$")
    public void theNumberOfOrdersShouldNotChange() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheNumberOf.actualOrdersWithoutChanges()));
    }

    @Then("^the number of order should have increased by 1$")
    public void theNumberOfOrderShouldBe() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(NumberOf.actualOrdersIncreasedByOne()));
    }
}
