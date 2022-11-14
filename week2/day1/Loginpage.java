package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement eleusername = driver.findElement(By.id("username"));
		 eleusername.sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 //driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Saletrial");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test1");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sale1");
		 WebElement dd=driver.findElement(By.id("createLeadForm_dataSourceId"));
		 Select ddselect=new Select(dd);
		 ddselect.selectByValue("LEAD_DIRECTMAIL");
		 
		 driver.findElement(By.name("submitButton")).click();
		 driver.close();
		 }


}
