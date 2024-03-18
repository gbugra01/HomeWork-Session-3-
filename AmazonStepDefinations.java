package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinations {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
        amazonPage.rejectCookie.click();
    }

    @When("kullanici Iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.searchBox.sendKeys("Iphone" + Keys.ENTER);
    }

    @Then("kullanici sonuclarin Iphone icerdigini test eder")
    public void kullaniciSonuclarinIphoneIcerdiginiTestEder() {
        String actaulResult = amazonPage.resultPanel.getText();
        Assert.assertTrue(actaulResult.contains("Iphone"));
    }

    @And("kullanici sayfayi kapatır")
    public void kullaniciSayfayiKapatır() {
        Driver.quitDriver();
    }

    @When("kullanici Selenium aratir")
    public void kullaniciSeleniumAratir() {
        amazonPage.searchBox.sendKeys("Selenium" + Keys.ENTER);
    }
        @Then("kullanici sonuclarin Selenium icerdigini test eder")
        public void kullaniciSonuclarinSeleniumIcerdiginiTestEder() {
            String actaulResult = amazonPage.resultPanel.getText();
            Assert.assertTrue(actaulResult.contains("Selenium"));
    }

    @When("kullanici Java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }

    @Then("kullanici sonuclarin Java icerdigini test eder")
    public void kullaniciSonuclarinJavaIcerdiginiTestEder() {
        String actaulResult = amazonPage.resultPanel.getText();
        Assert.assertTrue(actaulResult.contains("Java"));
    }

    @When("kullanici {string} aratir")
    public void kullaniciAratir(String searchedObject) {
        amazonPage.searchBox.sendKeys(searchedObject,Keys.ENTER);
    }

    @Then("kullanici sonuclarin {string} icerdigini test eder")
    public void kullaniciSonuclarinIcerdiginiTestEder(String object) {
        Assert.assertTrue(amazonPage.resultPanel.getText().contains(object));
    }


    @Then("The user searches {string}")
    public void theUserSearches(String product) {
        amazonPage.searchBox.sendKeys(product,Keys.ENTER);
    }

    @Then("The user tests successfull search {string}")
    public void theUserTestsSuccessfullSearch(String confirmProduct) {
        Assert.assertTrue(amazonPage.resultPanel.getText().contains(confirmProduct));
    }
}