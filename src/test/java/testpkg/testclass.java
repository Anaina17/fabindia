package testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.baseclass;
import pagepkg.pageclass;
import utilispkg.utilisclass;

public class testclass extends baseclass {
		@Test
		public void logodisplay()
		{
		WebElement logo=driver.findElement(By.xpath("/html/body/app-root/div/cx-storefront/div[2]/div/div/div[2]/a/img"));	
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("failed");
		}
		}
		@Test
	
		public void testlogin() throws InterruptedException
		{
			pageclass a1=new pageclass(driver);
			a1.selectloginby();
			
			String xl="C:\\Users\\USER\\Documents\\fabindia.xlsx";
			String Sheet="Sheet1";
			int rowCount=utilisclass.getRowCount(xl,Sheet);
			for(int i=1;i<=rowCount;i++)
			{
		
				String Email=utilisclass.getCellValues(xl, Sheet, i, 0);
				System.out.println("username----"+Email);
				
				String Password=utilisclass.getCellValues(xl, Sheet, i, 1);
				System.out.println("password----"+Password);
				
				a1.selectvalues(Email, Password);
				driver.navigate().refresh();
				driver.navigate().back();
			
				Thread.sleep(3000);
				a1.selectproduct();
		}
		}

}