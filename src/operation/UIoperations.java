package operation;
import org.testng.Assert;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIoperations extends Getobjectclass {
WebDriver driver;
//public static Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
public UIoperations(WebDriver driver)
{
	this.driver=driver;
}

public void perform(Properties p,String operation,String objectname,String objectType,String value) throws Exception
{
//System.out.println("manage value " +p.getProperty("backupfileText"));
switch(operation.toUpperCase())
{
case "CLICK":
driver.findElement(this.getObject(p, objectname, objectType)).click();
break;
case "SETTEXT":
	driver.findElement(this.getObject(p, objectname, objectType)).sendKeys(value);
break;

case "GOTOURL":
	driver.get(p.getProperty(value));
	break;


// chaman


case "VERIFY":
	String element = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
	System.out.println(element);
	try
	{
	Assert.assertEquals(element, value);
	System.out.println("data match, Proceed !!!");
	}
	catch(Exception e)
	{
		System.out.println("Data do not matche and give exception- " +e.getMessage());
	}
	break;
	
case "SCROLL":
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,450)", "");
	break;
	
case "CLOSE":
	//APP_LOGS.info("Closing browser");
	driver.close();
//	APP_LOGS.info("Closed browser");
	break;

	
case "IMPLICITWAIT":
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	break;
case "EXPLICITWAIT":
	WebDriverWait wait= new WebDriverWait(driver, 3000);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(this.getObject(p, objectname, objectType))));
	break;
case "DRIVERWAIT":
	try
	{
		  long time = (long)Double.parseDouble(value);
	        Thread.sleep(time*1000L);}
	catch (NumberFormatException e){
	       System.out.println("not a number"); }
//	Thread.sleep(2000);
	break;
	

//chaman end 


case "ASSERTDELETE":
	String txt = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
	System.out.println(txt);
	if(driver.getPageSource().contains(txt))
	{
		System.out.println("company not deleted ");
	}
	
	else 
	{
		System.out.println("company deleted successfully ");
	}
	
	
	break;
case "JAVAEXECUTOR_CLICK":
	WebElement click_element = driver.findElement(this.getObject(p, objectname, objectType));
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	//jse1.executeScript("alert('Are you sure you want to delete this record?');");
	jse1.executeScript("arguments[0].click();", click_element);
	
	//driver.assertIn("value", value);
	break;

	
	
	// Rajeev Started Here 

	
case "JAVASENDKEYS":
	WebElement click_element1 = driver.findElement(this.getObject(p, objectname, objectType));
	click_element1.sendKeys(Keys.RETURN);
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("arguments[0].click();", click_element1);
	jse2.executeScript("document.getElementById('atc_Portfolio').value='Consum';"); 
	
	break;
	
	
	
	default:
		break;
}
	}
}
