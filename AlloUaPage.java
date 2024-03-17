package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AlloUaPage {
    public AlloUaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='search-form__input']")
    public WebElement searchBox;
    @FindBy(xpath = "(//*[@class='b-crumbs__link'])[2]")
    public WebElement resultPanel;




}
