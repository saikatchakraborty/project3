package basicFunctionalities;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
public static void main(String[] args) throws InterruptedException {
	    
	    
		
	   Select select;
	   Actions a ;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saikat.chakraborty\\OneDrive - Entain Group\\Desktop\\Automation\\Browserextension\\chromedriver.exe ");
	    WebDriver  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://demo.guru99.com/V1/index.php");
	    driver.findElement(By.xpath("//a[@href='http://demo.guru99.com/insurance/v1/index.php']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='register.php']")).click();
	    select = new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the choose you want to select");
	    String s1= s.nextLine();
	    select.selectByVisibleText(s1);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user_firstname']")).sendKeys("Saikat");
	    driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("chakraborty");
	    driver.findElement(By.xpath("//input[@id='user_phone']")).sendKeys("7992216198");
	    Thread.sleep(3000);
	    select = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
	    System.out.println("\n Enter the year of DOB");
	    String dob =s.nextLine();
	    select.selectByVisibleText(dob);
	    Thread.sleep(3000);
	    select = new Select(driver.findElement(By.xpath("//sel	ect[@id='user_dateofbirth_2i']")));
	    System.out.println("\n Enter the month  of DOB ");
	    String month =s.nextLine();
	    select.selectByVisibleText(month);
	    Thread.sleep(3000);
	    select = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
	    System.out.println("\n Enter the date  of DOB ");
	    String date = s.nextLine();
	    select.selectByVisibleText(date);
	    System.out.println("\nEnter the type of insurance you wan to join");
	    int choice= s.nextInt();
	     a = new Actions(driver);
	     Thread.sleep(3000);
	    switch(choice)
	    {
	    case 1:
	    a.moveToElement(driver.findElement(By.xpath( "//input[@id='licencetype_t']"))).click().perform();
	    System.out.println("selected full option");	
	    break;
	    case 2:
	    	a.moveToElement(driver.findElement(By.xpath( "//input[@id='licencetype_f']"))).click().perform();
		    System.out.println("selected Provisional option");	
		break;
	    }
	    System.out.println("enter the number of years you want to ensure");
	    String iyears =s.nextLine();
	    select = new Select(driver.findElement(By.xpath("//select[@id='user_licenceperiod']")));
	    select.selectByVisibleText(iyears);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user_address_attributes_street']")).sendKeys("A/84 bagunnagar baridih jamshedpur");
	    driver.findElement(By.xpath("//input[@id='user_address_attributes_city']")).sendKeys("Jamshedpur");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user_address_attributes_county']")).sendKeys("India");
	    driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']")).sendKeys("831017");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']")).sendKeys("saikat.chakrabortybe@gmail.com");
	    driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']")).sendKeys("babai@123");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']")).sendKeys("babai@123");
	    System.out.println("\n enter the choice you want to do reset or create");
	    int choice1 =s.nextInt();
	    Thread.sleep(3000);
	    switch(choice1)
	    {
	    case 1:
	    System.out.println("selected reset");
	    driver.findElement(By.xpath("//input[@id='resetform']")).click();
	    break;
	    case 2:
	    	System.out.println("selected create");
	    	driver.findElement(By.xpath("//input[@name='submit']")).click();
	    break;
	    }
	    
	    driver.close();
}
}
