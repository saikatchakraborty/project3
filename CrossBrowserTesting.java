package basicFunctionalities;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTesting {
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = null;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 for Google Chrome.\nEnter 2 for MicrosoftEdge. ");
		int input=s.nextInt();
		switch(input)
		{
			case 1:
				System.out.println("**Welcome to Google Chrome**");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
			     driver = new ChromeDriver();
			    break;
			case 2:
				System.out.println("**Welcome to Microsoft Edge**");
			    System.setProperty("webdriver.msedge.driver", "C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\msedriver.exe");
			    driver=new EdgeDriver();
			    break;	
		}
		 driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		 driver.get("https://demo.guru99.com/V1/index.php");
		 driver.close();
		 
		
	}
}
