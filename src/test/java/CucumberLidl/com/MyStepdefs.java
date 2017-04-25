package CucumberLidl.com;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class MyStepdefs extends BaseTest {
    @Given("^User already on home page$")
    public void User_already_on_home_page() {
        openBrowser();
    }

    @When("^I click on carreer$")
    public void I_click_on_carreer() {
        driver.findElement(By.xpath("//span[text()='Careers']")).click();
    }

    @Then("^I see carreer page$")
    public void I_see_carreer_page() {
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        //Assert
        Utiles.assertByGetAttribute(By.xpath("//div/footer/ul/li[3]/p/strong"), "innerText", "Lidl - an international group of companies", "user not on job serach page");

    }

    @When("^I click job search$")
    public void I_click_job_search() {
        Utiles.elementToBePresent(By.xpath("//nav[2]/div/a/span/span"), 5);
        driver.findElement(By.xpath("//nav[2]/div/a/span/span")).click();
    }

    @When("^I enter job tital$")
    public void I_enter_job_tital() {
        driver.findElement(By.xpath("//input[@id='what']")).sendKeys("Store manager");

    }

    @When("^I enter postcode or city name$")
    public void I_enter_postcode_or_city_name() {
        driver.findElement(By.xpath("//input[@id='where']")).sendKeys("COVENTRY");

    }

    @When("^I click on job search$")
    public void I_click_on_job_search() {
        driver.findElement(By.xpath("//a[contains(text(),'Job Search')]")).click();

    }

    @Then("^I see all vaccancie list$")
    public void I_see_all_vaccancie_list() {
        //Assert
        Utiles.assertByGetText(By.xpath("//div[2]/label"),
                "What location are you interested in?", "user cant see vaccancie list");

    }

}