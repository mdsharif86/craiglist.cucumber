package StepDefiniton;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import Base.base;
import io.cucumber.java.en.Given;

public class VerifyLandingPage extends base {
	@Given("I am in craiglist.com")
	public void i_am_in_craiglist_com() {
	 navigateUrl("https://www.walgreens.com/");   
	}

//	@Given("I want to go to search button and click on cars")
//	public void i_want_to_go_to_search_button_and_click_on_cars() {
//	   boolean isSearchPageExists = driver.findElement(By.xpath("//input[@data-autocomplete='search-count']")).isDisplayed();
//	   boolean expected = true;
//	   assertEquals(isSearchPageExists, expected);
//	}
//
//	@Given("I want to view how many cars in one page")
//	public void i_want_to_view_how_many_cars_in_one_page() {
//	    boolean ishowManyCarExists = driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[3]/div[3]/span[2]/span[3]/span[2]")).isDisplayed();
//	    boolean expected = true;
//	    assertEquals(ishowManyCarExists, expected);
//	    
	   
	}

