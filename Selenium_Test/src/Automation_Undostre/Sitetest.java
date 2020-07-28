package Automation_Undostre;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sitetest {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		 String exePath = "C:\\Users\\Administrator\\Downloads\\Webdriver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", exePath);
		 WebDriver driver = new ChromeDriver();
		 //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 String title =driver.getTitle();
		 System.out.println("GET Title " +title);
		 driver.get("http://prueba.undostres.com.mx");
		 
		 Actions act = new Actions(driver);
		 //select operator
		 act.moveToElement(driver.findElement(By.name("operator"))).click().build().perform();
		 driver.findElement(By.xpath("//body//li//li[1]")).click(); //Select operator
		 // Enter mobile number
		 driver.findElement(By.name("mobile")).sendKeys("5523261151");
		 //enter amount
		 act.moveToElement(driver.findElement(By.name("amount"))).click().build().perform();
		 driver.findElement(By.className("desc-info")).click();
		 //press Siguiente
		 driver.findElement(By.xpath("//div[contains(@class,'box menuitem')]//div[3]//div[1]//button[1]")).click();
	
		 //ON PAYMENT SCREEN ENTER THE CARD DETAILS
		
		 //ENTER CARD NAME
		 act.moveToElement(driver.findElement(By.xpath("//div[@class='field form-group']//input[@name='cardname']"))).click().build().perform();
		 driver.findElement(By.xpath("//div[@class='field form-group']//input[@name='cardname']")).sendKeys("Test");
		 //ENTER CARD NUMBER
		 driver.findElement(By.xpath("//input[@id='cardnumberunique']")).sendKeys("4111111111111111");
		 //ENTER MONTH
		 driver.findElement(By.xpath("//div[@class='field col-xs-5 col-md-5 paddleft0']//input[@name='expmonth']")).sendKeys("11");
		 //ENTER DATE
		 driver.findElement(By.xpath("//div[@class='field col-xs-7 col-md-7 paddleft0']//input[@name='expyear']")).sendKeys("2025");
		 //ENTER CVV
		 driver.findElement(By.xpath("//div[@class='field form-group']//input[@name='cvvno']")).sendKeys("111");
		
		 //ENTER EMAIL
		 driver.findElement(By.xpath("//form[@id='payment-form']//input[@name='txtEmail']")).sendKeys("test@test.com");
		 // clickInPaymentMethod form_submit
		 driver.findElement(By.xpath("//button[@id='paylimit']")).click();
		
		
		 // o Acceso con correo
		 //Enter email
		 driver.findElement(By.xpath("//input[@id='usrname']")).sendKeys("automationexcersise@test.com");
		 //Enter password
		 driver.findElement(By.xpath("//input[@id='psw']")).sendKeys("123456");
		 //select the checkbox
		 driver.findElement(By.xpath("//div[@class='g-recaptcha']")).click();
		 //click on Acceso button
		 driver.findElement(By.xpath("//button[@class='btn btn-blue btn-block']")).click();
		 //Browser wait for 30 seconds  
		 Thread.sleep(30000);
		 //Close Browser
		 driver.close();
		}
			catch(Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
	}

}
