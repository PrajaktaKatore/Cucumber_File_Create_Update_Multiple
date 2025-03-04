package stepDefination;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.BeforeAll;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.chrome.ChromeDriver;



public class Main
{
    
  
    static WebDriver driver;
    
        @BeforeAll
        public static void before() 
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoblaze.com/");  // Open the Demoblaze homepage
        }

    //Test1
    @Given("I am on the site homepage")
    public void userIsOnHomPage()
	{
        
    }
    

    @When("I click on {string} on")
    public void userClickOnSignUp(String elementText) 
	{
        driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[8]/a")).click();
    }

    @And("I enter {string} on ")
    public void enterUsername(String elementText)
    {
        driver.findElement(By.id("sign-usernamee2")).sendKeys("studymailid12@gmail.com");
    }

    @And("I enter {string} ")
    public void enterPassword(String elementText) 
    {
        driver.findElement(By.id("sign-password")).sendKeys("Prajakta@123");
    }

    @Then("I click on {string} on Page")
    public void clickOnSubmit(String elementText) 
    {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[1]")).click();
    }

    //Test2
    @Given("I have demoblaze account created")
    public void userIsOnHomePage()
	{
        
    }

    @When("I click on {string} on the {string} Page")
    public void IclickonLoginontheHomePage(String elementText,String pageName) 
    {
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[5]/a")).click();
    }

    @And("I enter {string} into user name field")
    public void entrUsername(String elementText)
    {
        driver.findElement(By.id("loginusername")).sendKeys("studymailid12@gmail.com");;
    }

    @And("I enter {string} into password field")
    public void entrPassword(String elementText) 
    {
        driver.findElement(By.id("loginpassword")).sendKeys("Prajakta@123");
    }

    @Then("I click on {string}")
    public void clickOnLogin(String elementText) 
    {
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
    } 


    //Test3
    @Given("I have logged in into demoblaze account")
    public void Ihavedemoblazeaccountcreated()
	{
    
    }

    @When("I click on {string} on the Page")
    public void Click_On_Product(String elementText) 
    {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();;
       
    }

    @And("I click on {string} button")
    public void clickOnAdd(String elementText)
    {
        
    }

    @Then("Product get added into Cart")
    public void userClickOnSubmit() 
	{
        
    }
}
