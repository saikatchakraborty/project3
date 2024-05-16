package basicFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLValidation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
	    WebDriver  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://demo.guru99.com/V1/index.php");
	    String currentUrl =driver.getCurrentUrl();
	    String  expectedUrl = "https://demo.guru99.com/V1/index.php";
	    if(currentUrl.equals(expectedUrl))
	    {
	    	System.out.println("url is expected");
	    			
	    }
	    else
	    {
	    	System.out.println("URL is not expected");
	    }
	    Thread.sleep(3000);
	    driver.close();
}
}
