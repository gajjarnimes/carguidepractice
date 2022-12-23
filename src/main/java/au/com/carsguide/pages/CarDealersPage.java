package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement cardealerField;

    @FindBy(xpath = "//div[@class='dealerListing--name']")
    List<WebElement> nameOfDealers;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;

    public void clickOnCarDealer(){
        clickOnElement(cardealerField);
    }
    public String gettingNameOfDealers(String text){
        log.info("feaching dealer :" + nameOfDealers.toString());
        for(WebElement data : nameOfDealers){
            String str = data.getText();
            if(str.equalsIgnoreCase(text)){

                return str;

            }
        }
        return null;
    }
    public void clickOnNextbutton(){
        clickOnElement(nextButton);
        log.info("Click on Next Button :" + nextButton.toString());
    }
}
