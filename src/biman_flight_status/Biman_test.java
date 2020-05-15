package biman_flight_status;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Biman_test extends Landing_pom {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.biman-airlines.com/");
		driver.manage().window().fullscreen();

		Biman_test obj4 = new Biman_test();

		
		
		
		obj4.clickFlSt();
		obj4.inputFlnum();
		obj4.clickviewstatus();
		obj4.errormsgchk();

		driver.close();

	}

}
