package StepDefiniton;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.base;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends base {
	
	@Before
	public void Setup () {
		
	
	ChromeOptions option = new ChromeOptions();
	option.setHeadless(false);
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
	}
}
