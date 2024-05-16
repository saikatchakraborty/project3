package basicFunctionalities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Smoketesting_Mousehover {
	
		
		public static void main(String[] args) throws InterruptedException {
			    
			    
				System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
			    WebDriver  driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
			    Thread.sleep(2000);
			    driver.get("https://demo.guru99.com/V1/index.php");
			    driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']")).click();
			   // driver.switchTo().alert().accept();
			    driver.findElement(By.xpath("/input[@name='email']")).sendKeys("saikatchakrabortybe@gmail.com");
			    driver.findElement(By.xpath( "//input[@id='password']")).sendKeys("babai@123");
			    Thread.sleep(2000);
			    driver.findElement(By.xpath( "//input[@type='submit']")).click();
			    Actions a = new Actions(driver);
			    List<WebElement> ls =driver.findElements(By.xpath("//ul[@id='menu']/li"));
			    int size= ls.size();
			     System.out.println("No of elements: "+size);
			     for(int i=1;i<=size;i++)
			     {    Thread.sleep(2000);
			    	 System.out.println(driver.findElement(By.xpath("//ul[@id='menu']/li["+i+"]")).getText());
			    	 Thread.sleep(2000);
			    	 a.moveToElement(driver.findElement(By.xpath("//ul[@id='menu']/li["+i+"]"))).click().perform();
			     }
			    driver.close();
}
}
