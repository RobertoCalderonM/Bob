package firstExercises.SeleniumE1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Gecko_Driver {
	
	final static String adress="http://store.demoqa.com/";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get(adress);
		System.out.println(driver.getTitle());
		System.out.println("Title length: "+driver.getTitle().length());
		if(driver.getCurrentUrl().equals(adress)){
			System.out.println("Page verified");
		}
		System.out.println("Page source length: "+driver.getPageSource().length());
		Thread.sleep(5000);
		driver.quit();
	
	}

}
