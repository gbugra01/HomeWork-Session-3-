package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlloUAPage {
    public AlloUAPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='search-form__input']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@alt='Придбати -  Apple iPhone 15 Pro Max 256GB Natural Titanium (MU793)']")
    public WebElement firstElement;
    @FindBy(xpath = "//*[@class='pagination__next__link pagination__links']")
    public WebElement nextPage;
    @FindBy(xpath = "(//*[@class='pagination__links'])[1]")
    public WebElement previsionPage;
    @FindBy(xpath = "(//*[@class='b-crumbs__link'])[2]")
    public WebElement resultPanel;
    @FindBy(xpath = "//*[text()='50']")
    public WebElement page50;
    @FindBy(xpath = "//*[@class='pagination']")
    public WebElement pagesButton;
    @FindBy(xpath = "//*[text()=2]")
    public WebElement page2;
    @FindBy(xpath = "//*[text()='Ремінець Colored Strap для Xiaomi Mi Band 3/4 Бірюзовий']")
    public WebElement page50Element;
    @FindBy(xpath = "//*[text()=1]")
    public WebElement page1;
    @FindBy(xpath = "//*[text()=3]")
    public WebElement page3;

}
