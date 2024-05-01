package AutomationClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver Initialization
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
		
		
        //Windows & link
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		String ExpectedTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals("Conditions True",ExpectedTitle ,ActualTitle);
		/*//if-else
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Title Match");
		}
		else {
			System.out.println("Not Match");
		}
		*/
		//Assert.assertEquals(ExpectedTitle, ActualTitle);
		
		String ExpectedUrl="https://www.saucedemo.com/";
	    String ActualUrl=driver.getCurrentUrl();
	    Assert.assertEquals("Conditions True",ExpectedUrl, ActualUrl); 
	    /*  //if-else
	    if(ActualUrl.equals(ExpectedUrl)) {
			System.out.println("Url Match");
		}
		else {
			System.out.println("Not Match");
		}
		
	    */
	}

}
