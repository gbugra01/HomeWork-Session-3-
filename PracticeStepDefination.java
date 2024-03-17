package stepDefinations;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AlloUaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PracticeStepDefination {
    AlloUaPage alloUaPage=new AlloUaPage();
    @Given("The User launches {string}")
    public void the_user_launches(String sitesURL) {
    Driver.getDriver().get(ConfigReader.getProperty(sitesURL));
    }
    @When("TheUser searches {string} on searchbox")
    public void the_user_searches_on_searchbox(String product) {
        alloUaPage.searchBox.sendKeys(product, Keys.ENTER);

    }
    @Then("User tests search panel contains {string}")
    public void user_tests_search_panel_contains(String expectedResult) {
        Assert.assertTrue(alloUaPage.resultPanel.getText().contains(expectedResult));

    }

    @Then("User quites to browser")
    public void user_quites_to_browser() {
    Driver.quitDriver();
    }



}
