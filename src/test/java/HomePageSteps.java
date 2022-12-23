import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarsearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\"tab$")
    public void iMouseHoverOnTab() {
        new HomePage().clickOnBuySell();
    }

    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(){
        new HomePage().clickOnSearchCar();
    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage() {
        String actrualText= new NewAndUsedCarsearchPage().newAndUsedCarText();
        String expectedText="New & Used Car Search-carsguide";
        Assert.assertEquals(expectedText,actrualText);
    }

    @And("^I select make\"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarsearchPage().clickOnMake(make);
    }

    @And("^I select model\"([^\"]*)\"$")
    public void iSelectModel(String model){
        new NewAndUsedCarsearchPage().clickOnModel(model);
    }

    @And("^I select location\"([^\"]*)\"$")
    public void iSelectLocation(String location){
        new NewAndUsedCarsearchPage().clickOnLocation(location);
    }

    @And("^I select price\"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new NewAndUsedCarsearchPage().clickOnprice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarsearchPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make){
        new NewAndUsedCarsearchPage().resultText();
    }

   //@When("^I mouse hover on \"([^\"]*)\" tab$")
   // public void iMouseHoverOnTab(){
        //new NewAndUsedCarsearchPage().usedCarforSale();



    @And("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(){
        new HomePage().clickOnusedCar();
    }

  // @And("^I select make \"([^\"]*)\"$")
   // public void iSelectMake(String make){
       // new NewAndUsedCarsearchPage().clickOnMake(make);



    @And("^I select loction\"([^\"]*)\"$")
    public void iSelectLoction(String location){
        new NewAndUsedCarsearchPage().clickOnLocation(location);
    }
}
