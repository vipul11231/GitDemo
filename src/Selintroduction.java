import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selintroduction {

	public static void main(String[] args) {
	
		//Invoking Browser
		//Chrome Broswer
		//Chrome - Chrome browser -> methods close get
		//Safari - Safari browser -> methods close get
		//FirefoxDriver - Firefox browser -> methods close get
		//EdgeDriver - Edge browser -> methods close get
		//WebDriver methods + class methods
		//ChromeDriver driver = new ChromeDriver;
		//Webdriver.chrome.driver -> Value of path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rws\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		System.out.println("postjira1");
		System.out.println("postjira2");
		System.out.println("postjira3");
		//
		//
		//
		//
		//
		//
		//
		System.out.println("postjira4");
		System.out.println("postjira5");
		System.out.println("postjira6");
		System.out.println("postjira7");
		
		driver.get("https://travelsunique.in");
		System.out.println(driver.getTitle());	
		System.out.println(driver.getCurrentUrl());	
		driver.close();
		
		
	}

}
