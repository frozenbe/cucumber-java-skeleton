package skeleton;

import cucumber.api.java.en.Given;


public class Stepdefs {
    @Given("^I navigate to Universe landing page$")
    public void I_navigate_into_universe_page() throws Throwable {
        Navigation navigation = new Navigation();
        navigation.navigate();
    }
}
