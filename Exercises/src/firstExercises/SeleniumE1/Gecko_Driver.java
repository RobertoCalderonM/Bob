package firstExercises.SeleniumE1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Gecko_Driver {
	
	final static String adress="Store.DemoQA.com";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("Store.DemoQA.com");
		System.out.println(driver.getTitle());
		System.out.println("Title length: "+driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		Thread.sleep(5000);
		driver.quit();
	
	}

}
