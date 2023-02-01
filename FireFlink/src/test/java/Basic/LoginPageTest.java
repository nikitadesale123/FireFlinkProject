package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	@Test
	public void testcase2() {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("desalesanjay3933@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Nik@1234");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
		driver.findElement(By.xpath("(//a[contains(.,'Accessories')])[3]")).click();
	
	}

}
