package Tests.Ders10;

import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlloUAPage;

import java.util.ArrayList;
import java.util.List;

public class AlloUAPageClass {
    AlloUAPage alloUAPage=new AlloUAPage();
    @Test(priority = 1)
    public void alloUATest1(){
        //TODO:GO TO ALLO UA
        Driver.getDriver().get(ConfigReader.getProperty("alloUaURL"));
        //TODO:SEARCH IPHONE 15
        alloUAPage.searchBox.sendKeys("Iphone 15"+Keys.ENTER);
        //TODO:CLICK FIRST SEARCH ELEMENT AND PRINT ON CONSOLE
        System.out.println(alloUAPage.firstElement.getText());
        alloUAPage.firstElement.click();
        //TODO:GO BACK SEARCH PAGE
        Driver.getDriver().navigate().back();
        //TODO:GO TO NEXT PAGE
        ReusableMethods.scrollIntoViewJS(alloUAPage.nextPage);
        alloUAPage.nextPage.click();
        //TODO:BE CONFIRM NEXT PAGE HAS PRODUCTS ABOUT IPHONE
        Assert.assertTrue(alloUAPage.resultPanel.getText().contains("Iphone 15"));
        System.out.println(Driver.getDriver().getTitle());
        //TODO:CLICK PREVISION PAGE AND GO BACK
        ReusableMethods.scrollIntoViewJS(alloUAPage.previsionPage);
        ReusableMethods.waitForClickablility(alloUAPage.previsionPage,1);
        ReusableMethods.clickWithJS(alloUAPage.previsionPage);
        Driver.quitDriver();


    }
    @Test(priority = 2)
    public void alloUaTest2(){
        //TODO:GO TO ALLO UA
        Driver.getDriver().get(ConfigReader.getProperty("alloUaURL"));
        //TODO:SEARCH "Xiaomi" AND BE SURE SUCCESSFUL SEARCH RESULT
        alloUAPage.searchBox.sendKeys("Xiaomi"+Keys.ENTER);
        Assert.assertTrue(alloUAPage.resultPanel.getText().contains("Xiaomi"));
        //TODO:CONFIRM PAGE 50 IS CLICKABLE AND GO PAGE 50
        ReusableMethods.scrollIntoViewJS(alloUAPage.pagesButton);
        ReusableMethods.waitForClickablility(alloUAPage.page50,1);
        Assert.assertTrue(alloUAPage.page50.isDisplayed());
        ReusableMethods.clickWithJS(alloUAPage.page50);
        //TODO:CONFIRM PAGE 50 HAS PRODUCT IF HAS PRINT ON CONSOLE ONE TEXT OF PRODUCT
        Assert.assertTrue(alloUAPage.page50Element.isDisplayed());
        System.out.println(alloUAPage.page50Element.getText());
        //TODO:CLICK PAGE 1 AND GO
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollIntoViewJS(alloUAPage.pagesButton);
        ReusableMethods.clickWithJS(alloUAPage.page1);
        Driver.quitDriver();

    }
    @Test(priority = 3)
    public void alloUaTest3(){
        //TODO:GO TO ALLO UA
        Driver.getDriver().get(ConfigReader.getProperty("alloUaURL"));
        //TODO:SEARCH "Xiaomi" AND BE SURE SUCCESSFUL SEARCH RESULT
        alloUAPage.searchBox.sendKeys("Xiaomi"+Keys.ENTER);
        Assert.assertTrue(alloUAPage.resultPanel.getText().contains("Xiaomi"));
        //TODO: * - switch page "3"
        ReusableMethods.scrollIntoViewJS(alloUAPage.pagesButton);
        ReusableMethods.clickWithJS(alloUAPage.page3);
        //TODO:then click "<" then validate goods
        ReusableMethods.scrollIntoViewJS(alloUAPage.pagesButton);
        ReusableMethods.waitForVisibility(alloUAPage.previsionPage,1);
        ReusableMethods.clickWithJS(alloUAPage.previsionPage);
        Driver.quitDriver();

    }
}
