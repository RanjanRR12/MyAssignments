package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {

	 WebDriverManager.chromedriver().setup(); 
	 ChromeDriver driver=new ChromeDriver(); 
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.manage().window().maximize();
	 WebElement eleusername = driver.findElement(By.xpath("//input[@id='username']"));
	 eleusername.sendKeys("Demosalesmanager");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Saletrial");
	 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test1");
	 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sale1");
	 
	 driver.findElement(By.name("submitButton")).click();
	 driver.close();

}
}