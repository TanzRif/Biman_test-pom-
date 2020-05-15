package biman_flight_status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing_pom implements blueprint {

	WebDriver driver;
	

	
Landing_pom obj3 = new Landing_pom();


	
		
	


	@Override
	public void clickFlSt() {

		WebElement clicktab = driver.findElement(By.xpath("//a[@class='action-btn active-tab']"));
		clicktab.click();

	}

	@Override
	public void inputFlnum() {

		WebElement input = driver.findElement(By.xpath("//input[@placeholder='Flight Number']"));
		input.sendKeys("238");
	}

	@Override
	public void clickviewstatus() {

		WebElement clickst = driver.findElement(By.xpath("//button[@id='flight-status-btn']"));
		clickst.click();
	}

	@Override
	public void errormsgchk() {
		WebElement error = driver.findElement(By.xpath("//div[contains(text(),'Sorry! No information found.')]"));
		error.isDisplayed();
	}

}
