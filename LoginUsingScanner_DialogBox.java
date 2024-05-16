package basicFunctionalities;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingScanner_DialogBox {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
	      WebDriver  driver = new ChromeDriver(); 
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.get("https://demo.guru99.com/V1/index.php");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']")).click();	
	      String usn =JOptionPane.showInputDialog("Enter username");
	      driver.findElement(By.xpath( "/input[@name='email']")).sendKeys(usn);
	      Thread.sleep(2000);
	      String pwd =JOptionPane.showInputDialog("Enter username");
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
	      Thread.sleep(2000);
}
}