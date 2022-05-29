package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class tutorialPageStep {

    pages.tutorialPage tutorialPage = new pages.tutorialPage(DriverFactory.getDriver());

    @Given("Enes is opened LcWaikiki App")
    public void enesIsOpenedLcWaikikiApp() {
        tutorialPage.checkOpenedApp();
    }

    @Then("should see TvTutorial")
    public void shouldSeeTvTutorial() {
        tutorialPage.checkTvTutorial();
    }

    @Then("should see {string} text")
    public void shouldSeeText(String arg0) {
        tutorialPage.checkText(arg0);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) {
        tutorialPage.checkTitle(arg0);
    }

    @Then("should see {string} title description")
    public void shouldSeeTitleDescription(String arg0) {
        tutorialPage.ceheckTitleDesc(arg0);
    }
    @Then("should see {string} button")
    public void shouldSeeButton(String arg0) {
        tutorialPage.checkButton(arg0);
    }
    @When("drag and drop TvTutorial")
    public void dragAndDropTvTutorial() {
        tutorialPage.dragAndDropTvTutoial();
    }

    @When("click Skip button")
    public void clickSkipButton() {
        tutorialPage.clickSkipButton();
    }

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        tutorialPage.checkkHomePage();
    }
}
