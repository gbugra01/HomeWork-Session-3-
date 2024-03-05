package Tests.HomeWork;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Allo extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void alloTest(){
        //TODO:GO TO ALLO UA
        driver.get("https://allo.ua/");
        //TODO:BE SURE URL CONTAINS "allo"
        String expectedURLData="allo";
        String actualURLData=driver.getCurrentUrl();
        Assert.assertTrue(actualURLData.contains(expectedURLData));
        //TODO:PLEASE PRINT SITE TITLE ON CONSOLE
        System.out.println(driver.getTitle());
        //TODO:SEARCH IPHONE 15
        WebElement searchBox= driver.findElement(By.xpath("//*[@id='search-form__input']"));
        searchBox.sendKeys("Iphone 15"+ Keys.ENTER);
        //TODO:CONFIRM SUCCESS SEARCH RESULT
        String expectedSearchResult="Iphone 15";
        String actualSearchResult=driver.findElement(By.xpath("(//*[@class='b-crumbs__link'])[2]")).getText();
        Assert.assertTrue(actualURLData.contains(expectedURLData));
        //TODO:PRINT ON CONSOLE AFTER SEARCH FIRST PRODUCT
        WebElement firstSearchElement=driver.findElement(By.xpath("(//*[@title='Apple iPhone 15 Pro Max 256GB Natural Titanium (MU793)'])[2]"));
        System.out.println(firstSearchElement.getText());

    }
}
