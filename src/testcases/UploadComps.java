package testcases;

import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import operation.Getobjectclass;


public class UploadComps extends Getobjectclass
{ // no change in this file 
	WebDriver driver;

	public UploadComps(WebDriver driver)
	{
		this.driver=driver;
	}
	public void upload(Properties p,String operation,String objectname,String objectType,String value) throws Exception
	{

		switch(operation.toUpperCase())
		{

		case "SUBMIT":
			System.out.println("test submit method");

			// driver.findElement(By.cssSelector("button.blueButton.UtSubmit"));
			String s=driver.findElement(this.getObject(p, objectname, objectType)).getText();
			System.out.println("clicked on"+""+ s+" "+ "button");
			driver.findElement(this.getObject(p, objectname, objectType)).click();
			break;
// UI Operations
			
		case "GETTEXT":
			String s1=driver.findElement(this.getObject(p,objectname,objectType)).getAttribute("innerHTML");
			System.out.println("File name is "+" "+s1); 
			String fileExtensionName=s1.substring(s1.lastIndexOf("."));
			System.out.println("File Extension is"+" "+fileExtensionName);

			Thread.sleep(10000);
			String msg=driver.findElement(By.cssSelector("td.Message")).getText();
			System.out.println("Actual msg is:"+" "+msg); 
			String actualmsg=s1+value;
			String invalidexcelmsg=s1+value;
			String forReviewmsg=s1+" -- In order to update the file, Please download the file from the system first";
			//String WrongcompanyorTicker=s1+" -- Uploded file is not same as downloaded from system";
			
			String WrongcompanyorTicker=s1+value;
			
			
			if(fileExtensionName.equals(".txt"))
			{
				
				Assert.assertEquals(actualmsg,msg );
				System.out.println("right message dispalyed for .txt extension file");

			}
			else if(fileExtensionName.equals(".pdf"))
			{
				Assert.assertEquals(actualmsg,msg );
				System.out.println("right message dispalyed for .pdf extension file");
			}
			else if(fileExtensionName.equals(".xls"))
			{
				Assert.assertEquals(actualmsg,msg );
				System.out.println("right message dispalyed for .xls extension file");
			}
			
			//generic file 
			else if(fileExtensionName.equals(".xlsx")&& s1.contains("generic") )
			{
				Assert.assertEquals(invalidexcelmsg,msg );
				System.out.println("right message dispalyed for invalid .xlsx  file");
			}
			
			
			//review file 
			else if(fileExtensionName.equals(".xlsx") && s1.contains("(for review)"))
			{
				Assert.assertEquals(WrongcompanyorTicker,msg );
				System.out.println("right message dispalyed for ForReview File .xlsx  file");
			}
			
			//wrong company name 
			
			else if(fileExtensionName.equals(".xlsx") && s1.contains("WrongCompanyName"))
			{
				Assert.assertEquals(WrongcompanyorTicker,msg );
				System.out.println("right message dispalyed for valid Wrong Company Name file");
			}
			
			//wrong ticket id 
			else if(fileExtensionName.equals(".xlsx") && s1.contains("WrongTickerId"))
			{
				Assert.assertEquals(WrongcompanyorTicker,msg );
				System.out.println("right message dispalyed for valid Wrong ticker id file");
			}
			
			
			// Wrong version id 
			else if(fileExtensionName.equals(".xlsx") && s1.contains("WrongVersionID") && s1.contains("Consumer_NY") )
			{
				Assert.assertEquals(WrongcompanyorTicker,msg );
				System.out.println("right message dispalyed for Wrong version id   file");
			}
			
			

			// Wrong template  id 
			else if(fileExtensionName.equals(".xlsx") && s1.contains("WrongTemplateID") && s1.contains("Consumer_NY") )
			{
				Assert.assertEquals(WrongcompanyorTicker,msg );
				System.out.println("right message dispalyed for Wrong tempalte id  file");
			}
			
			
			// Control sheet missing 
				else if(fileExtensionName.equals(".xlsx") && s1.contains("ControlSheetMissing") )
				{
					Assert.assertEquals(WrongcompanyorTicker,msg );
					System.out.println("right message dispalyed for missing control shhet  file");
				}
				
			
				
			else if(fileExtensionName.equals(".xlsx") && s1.contains("Consumer_NY") && s1.contains("PVH Corp._PVH") )
			{
				
				String validmsg="Uploaded Successfully";
				Thread.sleep(1000);
				Assert.assertEquals(value,msg );
				System.out.println("right message dispalyed for valid .xlsx  file");
			}
			
				
			break;
			
		case "GETTEXT1":  //for backup text 
			
			
			System.out.println("check  validation message on backup file  ");
			
			String filename=driver.findElement(this.getObject(p,objectname,objectType)).getText();
			System.out.println("Filename is: "+" "+ filename); 
			String fileExtensionName1=filename.substring(filename.lastIndexOf("."));
			System.out.println("file extension is: "+" "+fileExtensionName1);
			Thread.sleep(10000);
			String msg1=driver.findElement(By.cssSelector("td.Message")).getText();
			System.out.println("message dispalyed on uploading .zip file as back is: "+msg1);
			

			
			
			
			String successmsg="Uploaded Successfully";
			String wrongmsg=filename+" -- Only zip folder is allowed to Upload";
			
			if(fileExtensionName1.equals(".zip"))
			{
				
				
				
				Assert.assertEquals("Uploaded Successfully",msg1 );
				System.out.println("msg dispalyed correctly for the .zip backup");
			
				// check progress message if backup file is .zip older 
				
				String getProgressValidMessage=driver.findElement(By.xpath("html//body//div[2]//div//div//div//div[3]//div[10]//div//div[2]//div//div//div//table//tbody//tr[2]//td[4]//div//div[1]")).getText();
				System.out.println("Progress messaqge on uploading backup file as .zip is: "+" "+getProgressValidMessage);
				Assert.assertEquals("File Uploaded.. 100% of 100%",getProgressValidMessage );
				
			}
			
			else
			{
				
				
				Assert.assertEquals(wrongmsg,msg1 );
				System.out.println("msg dispalyed correctly for invalid backup file");
				
				// check progress message if backup file is not .zip older 
				
				String ProgressActualinvalidmessage="File Could Not Be Uploaded";
				String getprogressinvalidMsg=driver.findElement(By.xpath("html//body//div[2]//div//div//div//div[3]//div[10]//div//div[2]//div//div//div//table//tbody//tr[2]//td[4]//div")).getText();
				System.out.println("Progress messaqge on uploading invalid backup file  is: "+" "+getprogressinvalidMsg);
				
				String s11=getprogressinvalidMsg.substring(0,26);
				Assert.assertEquals(ProgressActualinvalidmessage,s11);
			
				System.out.println("Progress message displayed correclty on uploading invalid backp file  ");
				
				
			}
			
			
			
			break;
			
			
			// UIOperations 
		
			
			
			
		case "CheckBoxAll":
			System.out.println("Enter into the selectall checkbox case ");
			List<WebElement> checkBoxList= driver.findElements(this.getObject(p, objectname, objectType));
			System.out.println(checkBoxList.size());
			for(WebElement checkBox:checkBoxList)
			{
				 if(checkBox.isSelected())
				 {
					 System.out.println("check box selected");
				 }
				 
				 else
				 {
					 	System.out.println("check box  not selected");
				 }
					 
					 
					 
				//boolean status=driver.findElement(this.getObject(p, objectname, objectType)).isSelected();
				//System.out.println(status);
			}
			
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			



		default:
			break;
		}
	}

}

