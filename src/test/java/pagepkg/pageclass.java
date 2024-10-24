package pagepkg;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class pageclass {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/app-root/div/cx-storefront/div[2]/div/div/div[3]/cx-page-slot/app-fab-login-slot/div")
	WebElement login;
		
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-email-login/div/div/div/app-fab-mobile-login/div/div/div/div/div/form/div[2]/div[2]/button")
		WebElement loginusingpassword;
		
		@FindBy(xpath="//*[@id=\"logiemail\"]")
		WebElement email;
		@FindBy(xpath="//*[@id=\"logipass\"]")
		WebElement password;
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-email-login/div/div/div/div[2]/form/div[3]")
		WebElement loginbutton;
		@FindBy(xpath="//*[@id=\"HomeMainScrollBannerComponent\"]/div[1]/div[1]/cx-banner/cx-generic-link/a/cx-media/img")
		WebElement items;
		@FindBy(xpath="//*[@id=\"products-section\"]/app-fab-product-scroll/div/div[1]/div[1]/app-fab-product-grid-item/a/cx-media/img")
		WebElement saree;
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/main/cx-page-layout/cx-page-slot[1]/app-fab-add-to-cart/form/button")
		WebElement addtocart;
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/div[2]/div/div/div[3]/cx-page-slot/cx-mini-cart/a/span[1]")
		WebElement Gotocart;
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/main/cx-page-layout/cx-page-slot[3]/cx-cart-totals/div/button")
		WebElement proceedtocheckout;
		@FindBy(xpath="/html/body/app-root/div/cx-storefront/main/cx-page-layout/cx-page-slot[3]/app-fab-checkout-order-summary/div[2]/button")
		WebElement addresscontinue;
		@FindBy(xpath="//*[@id=\"payment-card\"]")
		WebElement paymentcard;
		
		public pageclass(WebDriver driver)
		{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
		public void selectloginby()
		{
			login.click();
			loginusingpassword.click();
			
			
		}
		
		public void selectvalues(String Email,String Password)
		{
		email.sendKeys(Email); 
		password.sendKeys(Password);
		loginbutton.click();
		
			
		}
		public void selectproduct()
		{
			items.click();
	        saree.click();
			addtocart.click();
			Gotocart.click();
			proceedtocheckout.click();
			addresscontinue.click();
			paymentcard.click();
		}
	}