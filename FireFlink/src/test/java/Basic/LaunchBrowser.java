package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev/");
		String ParentWindow=driver.getWindowHandle();
		driver.switchTo().window(ParentWindow);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		

}
}	