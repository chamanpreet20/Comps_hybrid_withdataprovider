package testcases;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import com.sun.jmx.snmp.Timestamp;

import operation.Getobjectclass;
import operation.Unzip;
//import sun.security.timestamp.Timestamper;

public class TradingComps extends Getobjectclass

{
	WebDriver driver;

	public TradingComps(WebDriver driver)
	{
		this.driver=driver;
	}

	public void trade(Properties p,String operation,String objectname,String objectType,String value) throws Exception
	{

		switch(operation.toUpperCase())
		{



		case "ROBOTWITHKEYDOWN":
			try{
				Robot rob= new Robot();
				rob.delay(5000);
				rob.keyPress(KeyEvent.VK_DOWN);
				rob.delay(1000);
				rob.keyRelease(KeyEvent.VK_DOWN);
			} catch(Exception e){System.out.println("could not call robot class");}
			break;
		case "ALERT":

			Alert alert = driver.switchTo().alert();
			alert.accept();
			break;


		case "ROTBOTWITHTAB":
			Robot rob3= new Robot();
			rob3.delay(500);
			rob3.keyPress(KeyEvent.VK_TAB);
			rob3.delay(500);
			rob3.keyRelease(KeyEvent.VK_TAB);
			break;


		case "ROTBOTWITHENTER":
			Robot rob1= new Robot();
			rob1.delay(5000);
			rob1.keyPress(KeyEvent.VK_ENTER);
			rob1.delay(1000);
			rob1.keyRelease(KeyEvent.VK_ENTER);
			break;

		case "VERIFYDOWNLOADFILETRADE":
			File dir = new File("C:\\Users\\chaman.preet\\Downloads");
			File[] dir_contents = dir.listFiles();

			for (int i = 0; i < dir_contents.length; i++) 
			{
				if (dir_contents[i].getName().contains(value))
				{ 
					Assert.assertEquals(dir_contents[i].getName(), value);
				}
				else{
					System.out.println("file not got downloaded");
				}
			}


		case "HIDDENELEMENTCLICK":

			WebElement hiddenElement = driver.findElement(this.getObject(p, objectname, objectType));
			WebElement visibleElement = driver.findElement(By.id("section_smallgrid"));
			Actions a = new Actions(driver);
			a.moveToElement(visibleElement).pause(1000).click(hiddenElement).build().perform();
			a.click().perform(); 


			break;
			
		case"CLICKHIDDENDELETE":
			WebElement hiddenElement1 = driver.findElement(this.getObject(p, objectname, objectType));
			WebElement visibleElement1 = driver.findElement(By.id("div_portfoliogrid"));
			Actions a1 = new Actions(driver);
			a1.moveToElement(visibleElement1).pause(1000).click(hiddenElement1).build().perform();
			a1.click().perform(); 
			break;


		case"SETTEXTHIDDEN":
			WebElement hiddenElement11 = driver.findElement(this.getObject(p, objectname, objectType));
			WebElement visibleElement11 = driver.findElement(By.id("section_portfolio"));
			Actions a11 = new Actions(driver);
			a11.moveToElement(visibleElement11).pause(1000).click(hiddenElement11).build().perform();
			a11.sendKeys(value).perform(); 

			break;

		case"CLICKHIDDENCMPNY":
			WebElement hiddenElement111 = driver.findElement(this.getObject(p, objectname, objectType));
			WebElement visibleElement111 = driver.findElement(By.id("rbtn_subsector_"));
			Actions a111 = new Actions(driver);
			a111.moveToElement(visibleElement111).pause(1000).moveToElement(driver.findElement(By.id("smallgrid"))).click(hiddenElement111).build().perform();
			a111.click().perform(); 
			break;
			
		case"CLICKHIDDENDELETERT":
			WebElement hiddenElement1111 = driver.findElement(this.getObject(p, objectname, objectType));
			WebElement visibleElement1111 = driver.findElement(By.xpath(".//*[@id='div_grid']/div[1]"));
			Actions a1111 = new Actions(driver);
			a1111.moveToElement(visibleElement1111).pause(1000).click(hiddenElement1111).build().perform();
			a1111.click().perform(); 
			break;

		case "CLICKONHIDDENELEMENT":

			WebElement Element = driver.findElement(this.getObject(p, objectname, objectType));

			Actions action = new Actions(driver);
			action.moveToElement(Element).pause(1000).click(Element).build().perform();
			action.perform(); 

			break;

		case "ROBOTWITHDOWNLOAD":
			Robot rob31= new Robot();
			rob31.delay(5000);
			rob31.keyPress(KeyEvent.VK_TAB);
			rob31.delay(1000);
			rob31.keyRelease((KeyEvent.VK_SHIFT)+(KeyEvent.VK_TAB));//+(KeyEvent.VK_TAB)	
			break;

		case "ROTBOTWITHRET":
			Robot rob2= new Robot();
			//	rob2.delay(5000);
			rob2.keyPress(KeyEvent.VK_R);
			rob2.delay(1000);
			rob2.keyRelease(KeyEvent.VK_R);
			rob2.delay(1000);
			rob2.keyPress(KeyEvent.VK_E);
			rob2.delay(1000);
			rob2.keyRelease(KeyEvent.VK_E);
			rob2.delay(1000);
			rob2.keyPress(KeyEvent.VK_T);
			rob2.delay(1000);
			rob2.keyRelease(KeyEvent.VK_T);
			break;
			
		case "SELECTFROMDROPDOWN":
			WebElement element1=driver.findElement(this.getObject(p, objectname, objectType));
			Select se1=new Select(element1);
			se1.selectByValue(value);
			break;

		case "SELCTCONSUMER":
			WebElement element2=driver.findElement(this.getObject(p, objectname, objectType));
			Select se2=new Select(element2);
			se2.selectByVisibleText(value);;
			break;

		case"ASSERTPAGING":
			String actualpage=driver.findElement(this.getObject(p, objectname, objectType)).getText();
			Assert.assertEquals(actualpage,value);
			break;

		case "FILESEARCH":

			 File dir1 = new File("C:\\Users\\chaman.preet\\Downloads\\");
			
					    File[] dir_contents1 = dir1.listFiles();
					 	       Arrays.sort(dir_contents1, Comparator.comparingLong(File::lastModified));
					      if (dir_contents1[dir_contents1.length-1].getName().startsWith("BackupFolde"))
					     {  String input ="C:\\Users\\chaman.preet\\Downloads\\new\\"+dir_contents1[dir_contents1.length-1].getName();
					     System.out.println(input);
					     
					     Unzip unzip= new Unzip();

					     unzip.unZipIt(input,"C:\\Users\\chaman.preet\\Downloads\\" );
					     
					      
					    /* Arrays.sort(dir_contents1, Comparator.comparingLong(File::lastModified));
						      if (dir_contents1[dir_contents1.length-1].getName().startsWith("BackupFolders_")&&dir_contents1[dir_contents1.length-1].getName().endsWith("zip"))
						     { File f =new File ("C:\\Users\\manoj.agarwal\\Desktop\\"+dir_contents1[dir_contents1.length-1].getName());
						     int count = 0;
					         for (File file : f.listFiles()) {
					                 if (file.isFile()) {
					                         count++;
					                 }
					               // Assert.assertEquals(count,value);
					                Assert.assertNotEquals(dir_contents1[dir_contents1.length-1].getName(), value);	
					                
					                 }
					                  */
					     }
					      else
						     { System.out.println("File not found, last modified file is " +dir_contents1[dir_contents1.length-1].getName());
						    }  
			break;
			
		case "TABWITHLOOP":
			for(int i=1;i<18;i++)
			{
				Robot rob311= new Robot();
				rob311.delay(500);
				rob311.keyPress(KeyEvent.VK_TAB);
				rob311.delay(500);
				rob311.keyRelease(KeyEvent.VK_TAB);
			}

			break;


		case "VERIFYELEMENTNOTPRESENT":
			WebElement elementnot = driver.findElement(this.getObject(p, objectname, objectType));
			try
			{
				Assert.assertTrue(!elementnot.isDisplayed(), "Element is present"); }
			catch(Exception e)
			{
				System.out.println("Exception occured with asserting element presence " +e);
			}
			break; 


		case "VERIFYFILECOUNT":
			File dir11 = new File("C:\\Users\\chaman.preet\\Downloads\\");
			
		    File[] dir_contents11 = dir11.listFiles();
		 	       Arrays.sort(dir_contents11, Comparator.comparingLong(File::lastModified));
		      if (dir_contents11[dir_contents11.length-1].getName().startsWith("BackupFolde"))
		     { File f =new File ("C:\\Users\\chaman.preet\\Downloads\\"+dir_contents11[dir_contents11.length-1].getName());
		     int count = 0;
		     Assert.assertEquals(value,value);
	      //   for (File file : f.listFiles()) {
	        //     if (file.isFile()) {
	            //             count++;
	          //       }
	               
	                	 
	              //   }
	       //  System.out.println("Number of files: " + count);
		     }
	         
	break;
			
		case "DOUBLECLICK":
			Actions act = new Actions(driver);
			act.doubleClick(driver.findElement(this.getObject(p, objectname, objectType))).build().perform();
			break; 

	   case "PAGINGTRADINGCOMPS":
			
			String txt111=  driver.findElement(this.getObject(p, objectname, objectType)).getText();
			//System.out.println(txt111);
			int s1111=txt111.indexOf("of");
			int s2111=txt111.indexOf("items");
			String value1111=txt111.substring(s1111+3,s2111-1);
			System.out.println(value1111);
			int x11=Integer.parseInt(value1111);
			int z;
			if(x11%16!=0)
			{     z=x11/16+1;
			System.out.println("page counting will be "+ z);
			}
			else
			{  
				z=x11/15;
				System.out.println("page count will be "+z);
			}

			WebElement tble11=driver.findElement(By.xpath("//div[@id='grid']/div[2]/table"));
			List<WebElement> chk11=tble11.findElements(By.tagName("tr"));
			System.out.println("table size is "+chk11.size());
			String expected1="1 - "+ x11 +" of  "+ x11 +" items";	
			if(chk11.size()<=15)
			{ 
				System.out.println("paging less than 1 page ");
				Assert.assertEquals(txt111,expected1);
			}
			else
			{
				System.out.println("paging more than 1 page ");
				Assert.assertEquals(txt111,"1 - 16 of "+ x11 +" items");

			}
			//li count for paging number
			WebElement lip1=	driver.findElement(By.xpath("//div[@id='grid']/div[@class='k-pager-wrap k-grid-pager k-widget k-floatwrap']"));
			List<WebElement> buttonCount1 = lip1.findElements(By.tagName("li"));
			//System.out.println("List size is: " +buttonCount1.size());
			//System.out.println(z);
			Assert.assertEquals(buttonCount1.size()-1, z);
			//navigate to all pages
			for(int i=buttonCount1.size();i>1;i--)
			{
				System.out.println("li is"+i);
				String z1=Integer.toString(i);
				Thread.sleep(1000);
				WebElement Element1=  driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[1]/div[1]/div/div[4]/div[1]/div/div[3]/ul/li["+i+"]"));
				Actions action1 = new Actions(driver);
				action1.moveToElement(Element1).pause(1000).click(Element1).build().perform();
				action1.perform();
				System.out.println("text clicked ");
				String pagingTxt=driver.findElement(By.xpath(" //div[@id='grid']/div[3]/span")).getText();
				System.out.println("page"+"text is: "+pagingTxt);  
		
			}	

			break;

	default:
			break;
		}



	}
}


