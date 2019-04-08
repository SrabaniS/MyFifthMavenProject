package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FifthMavenProjectStepDefinition {
    static WebDriver mydriver ;
    @Given("^Open Chrome Browers$")
    public void open_Chrome_Browers()  {
        System.setProperty("webdriver.chrome.driver","C:\\work_space\\MyFifthMavenProject\\src\\chromedriver.exe");
        // Write code here that turns the phrase above into concrete actions
        mydriver = new ChromeDriver();
    }

    @When("^Enter Valid HSBC URl$")
    public void enter_Valid_HSBC_URl()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.get("https://www.google.com/search?ei=E2GrXJbVCO6c1fAP_d6umAg&q=hsbc&oq=hsbc&gs_l=psy-ab.3..0i131i67l2j0i67j0i131l3j0j0i131i67j0i131l2.2490.9674..10528...1.0..0.61.207.4......0....1..gws-wiz.....0.CurTxaXKKUA");
    }

    @Then("^Validated Santander Web Sites Open Succesfully$")
    public void validated_Santander_Web_Sites_Open_Succesfully()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.getTitle();
        System.out.println(mydriver.getTitle());
        mydriver.quit();

    }


}
