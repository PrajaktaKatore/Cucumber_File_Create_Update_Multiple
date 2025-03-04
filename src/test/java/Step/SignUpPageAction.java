package Step;


import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageAction 
{
    
    WebDriver driver;
    @FindBy(xpath ="/html/body/nav/div[1]/ul/li[8]/a")
    WebElement e1;

    @FindBy(id ="sign-username")
    WebElement e2;

    @FindBy(id ="sign-password")
    WebElement e3;

    @FindBy(xpath ="/html/body/div[2]/div/div/div[3]/button[1]")
    WebElement e4;

    public SignUpPageAction() {
       
    }
    
    public SignUpPageAction(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize WebElements
    }
    
    @Before
    public void setUp() 
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
    }
  
    @Given("I am on the site homepage")
    public void userIsOnHomePage()
	{
  
    }
    

    @When("I click on {string} on")
    public void userClickOnSignUp(String elementText) 
	{
        e1.click();
    }

    @And("I enter {string} on ")
    public void enterUsername(String elementText)
    {
        e2.sendKeys("studymailid12@gmail.com");
    }

    @And("I enter {string} ")
    public void enterPassword(String elementText) 
    {
       e3.sendKeys("Prajakta@123");
    }

    @Then("I click on {string} on Page")
    public void clickOnSubmit(String elementText) 
    {
        e4.click();
    }

} 

