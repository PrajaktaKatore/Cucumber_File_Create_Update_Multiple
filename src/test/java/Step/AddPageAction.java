package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPageAction
{
    
    WebDriver driver;
   

    @FindBy(xpath ="/html/body/div[5]/div/div[2]/div[2]/div/a")
    WebElement a2;


    public AddPageAction() {
        // No-argument constructor
    }

    public AddPageAction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements
    }

    @Given("I have logged in into demoblaze account")
    public void Ihavedemoblazeaccountcreated()
	{
    
    }

    @When("I click on {string} on the Page")
    public void Click_On_Product(String elementText) 
    {
		WebElement a1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a"));
        a1.click();
    }

    @And("I click on {string} button")
    public void clickOnAdd(String elementText)
    {
        a2.sendKeys("studymailid12@gmail.com");
    }

    @Then("Product get added into Cart")
    public void userClickOnSubmit() 
	{
        
    }
}
