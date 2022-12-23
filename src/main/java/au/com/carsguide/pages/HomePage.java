package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySellField;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCarField;

    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCarField;


    public void clickOnBuySell(){
        mouseHoverToElement(buySellField);
        log.info("clickOnBuySell : " + buySellField.toString());
    }
    public void clickOnSearchCar(){
        clickOnElement(searchCarField);
        log.info("clickOnSearchCar : " + searchCarField.toString());
    }
    public void clickOnusedCar(){
        clickOnElement(usedCarField);
        log.info("clickOnusedCar : " + usedCarField.toString());
    }
}
