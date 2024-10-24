package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
	public WebDriver driver;
	
	@BeforeClass
	public void precondition() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://fabindia.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}

}
