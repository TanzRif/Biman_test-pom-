package biman_flight_status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base extends Landing_pom{
	

	
	
	public Base() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.biman-airlines.com/");
		driver.manage().window().fullscreen();
		
	}
	
	Base obj = new Base();
	


	
	
	
}
