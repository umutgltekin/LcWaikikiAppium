package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.homePage;
import util.DriverFactory;

public class homePageStep {
    homePage homepage=new homePage(DriverFactory.getDriver());
    @Given("Enes is on Home Page")
    public void enesIsOnHomePage() {
        homepage.checkHomePage();
    }

    @Then("should see {string} navigation button")
    public void shouldSeeNavigationButton(String arg0) {
        homepage.checkNavigationButton(arg0);
    }

    @Then("should see {string} selected navigation button")
    public void shouldSeeSelectedNavigationButton(String arg0) {
        homepage.checkSelectedNavigationButton(arg0);
    }
}
