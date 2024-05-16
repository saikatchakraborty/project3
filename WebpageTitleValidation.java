package basicFunctionalities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageTitleValidation {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
    WebDriver  driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    
    driver.get("https://demo.guru99.com/V1/index.php");
     String expectedTittle= "GTPL Bank Home Page";
     String currenttittle = driver.getTitle();
     if(expectedTittle.equals(currenttittle))
     {
    	 System.out.println("tittle is expected and vaid");
     }
     else
    	 
     {
    	 System.out.println("Title is not expected and not valid");
     }
     Thread.sleep(3000);
    driver.close();
    
}
}
