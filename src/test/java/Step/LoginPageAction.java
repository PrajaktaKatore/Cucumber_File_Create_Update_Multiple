package Step;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction 
{
    
    WebDriver driver;
    @FindBy(xpath ="/html/body/nav/div[1]/ul/li[5]/a")
    WebElement l1;

    @FindBy(id ="loginusername")
    WebElement l2;

    @FindBy(id ="loginpassword")
    WebElement l3;

    @FindBy(xpath ="/html/body/div[3]/div/div/div[3]/button[2]")
    WebElement l4;


    public LoginPageAction() {
        // No-argument constructor
    }

    public LoginPageAction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements
    }
    @Given("I have demoblaze account created")
    public void userIsOnHomePage()
	{
    
    }

    @When("I click on {string} on the {string} Page")
    public void IclickonLoginontheHomePage(String elementText, String pageName) 
    {
		l1.click();
    }

    @And("I enter {string} into user name field")
    public void entrUsername(String elementText)
    {
        l2.sendKeys("studymailid12@gmail.com");
    }

    @And("I enter {string} into password field")
    public void entrPassword(String elementText) 
    {
       l3.sendKeys("Prajakta@123");
    }

    @Then("I click on {string}")
    public void clickOnLogin(String elementText) 
    {
        l4.click();
    }   
}
