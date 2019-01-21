package testcases;


import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import operation.Getobjectclass;
import operation.UIoperations;

public class Download_comps extends Getobjectclass{
	WebDriver driver;
	static int z=0;
	static String bs_Source;
	static String UpdatedBy;
	static String UpdatedDate;
	static String fillingDate;
	static String hold;
	static int totalnoofcompany;
	static String companylock;
	public Download_comps(WebDriver driver)
	{
		this.driver=driver;
	}

	@SuppressWarnings("deprecation")
	public void download(Properties p,String operation,String objectname,String objectType,String value) throws Exception
	{
		switch(operation.toUpperCase())
		{

		// Started By Chaman


		case "VERIFYELEMENTPRESENT":
			WebElement element = driver.findElement(this.getObject(p, objectname, objectType));
			try
			{
				Assert.assertTrue(element.isDisplayed(), "Element is present"); }
			catch(Exception e)
			{
				System.out.println("Exception occured with asserting element presence " +e);
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

		case "GETALERTTEXT":
			String text_dialog = driver.findElement(this.getObject(p, objectname, objectType)).getText().trim();
			try{
				//	Assert.assertEquals(text_dialog, value.trim(), "Data matches with expected"); }
				Assert.assertEquals(text_dialog,value.trim());
			}
			catch(Exception e)
			{
				System.out.println("Data do not matches and give exception- " +e.getMessage());
			}
			break;

		case "ASSERTCOMPANYBLANK":	
			if(driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("aria-activedescendant")==null)
				try{
					System.out.println("Yes! Company searchbox is blank");}
			//Assert.assertEquals(value, attribute_present);}
			catch(Exception e)
			{
				System.out.println("company searchbox gives exception- " +e.getMessage());
			}
			break;

		case "ELEMENTEXIST":
			WebElement icon_exist = driver.findElement(this.getObject(p, objectname, objectType));
			Assert.assertEquals(true, icon_exist.isDisplayed());
			break;

		case "VERIFYLOCK":
			int row_count =driver.findElements(this.getObject(p, objectname, objectType)).size();
			//int col_count = driver.findElements(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr[1]/td")).size();
			for(int i=1;i<=row_count;i++)
			{
				List<WebElement> lock_icon = driver.findElements(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr["+i+"]/td[11]/a[4]/span"));
				WebElement font_color = driver.findElement(By.xpath("//*[@id='grid']/div[2]/table/tbody/tr["+i+"]/td[3]/span"));
				if(font_color.getCssValue("color").equals("rgb(238, 38, 83)"))
				{
					System.out.println("Checking locked companies");
					Assert.assertFalse(lock_icon.size()>0, "Test case passed- Lock action button do not display for locked company");
				}
				else{
					System.out.println("Checking active companies");
					Assert.assertTrue(lock_icon.size()>0, "Active company displaying lock icon");
				}
			}
			break;





			//end by Chaman 	






			// started by Sweta 
		case "CLICKCHECKBOX":

			System.out.println("Enter into the selectall checkbox case ");
			if(driver.findElement(this.getObject(p, objectname, objectType)).isSelected())
			{
				//	driver.findElement(this.getObject(p, objectname, objectType)).click();
				System.out.println("test select all pages check box ");

				//driver.findElement(this.getObject(p, objectname, objectType)).click();			
			}


			else
			{
				driver.findElement(this.getObject(p, objectname, objectType)).click();
				System.out.println("test fail  ");
			}

			break;


		case "DESELECTCHECKBOX":

			System.out.println("deselct check box ");
			if(!driver.findElement(this.getObject(p, objectname, objectType)).isSelected())
			{
				System.out.println(" ");
			}


			else
			{
				Assert.fail();
			}



			break;



		case "GETALLCHECKBOXDESELECTED":
			//WebElement s=driver.findElement(this.getObject(p, objectname, objectType));
			List<WebElement> checkBoxList=driver.findElements(this.getObject(p, objectname, objectType));

			System.out.println("Total Checkbox number is:"+ checkBoxList.size());
			for(WebElement checkBox:checkBoxList)
			{
				if(checkBox.isSelected())
				{
					Assert.fail();

				}

				else
				{
					System.out.println("checkbox passed ");
				}
			}


			break;


		case "GETALLCHECKBOXSELECTED":
			//WebElement s=driver.findElement(this.getObject(p, objectname, objectType));
			List<WebElement> checkBoxList1=driver.findElements(this.getObject(p, objectname, objectType));

			System.out.println("Total Checkbox number is:"+ checkBoxList1.size());
			for(WebElement checkBox:checkBoxList1)
			{
				if(checkBox.isSelected())
				{
					System.out.println(" ");

				}

				else
				{
					Assert.fail();
				}
			}


			break;












		case "UI":   //download using AutoIT


			System.out.println("autoit start from here ");
			Runtime.getRuntime().exec("C:\\Users\\chaman.preet\\Documents\\C data\\git\\CompsBuilder_final\\downloadbackup.exe");

			break;


		case "ALERTACCEPT":


			System.out.println("alert accept here ");
			Alert alert=driver.switchTo().alert();		

			// Capturing alert message.    
			String alertMessage=driver.switchTo().alert().getText();		

			if(alertMessage.equals(value))

				// Displaying alert message		
				System.out.println(alertMessage);			

			// Accepting alert		
			alert.accept();

			break;

		case "PAGING":

			// paging start here 
			String txt=  driver.findElement(this.getObject(p, objectname, objectType)).getText();
			// String txt=	driver.findElement(By.cssSelector("span.k-pager-info.k-label")).getText();
			System.out.println(txt);
			//s1.substring(s1.lastIndexOf("."));
			int s1=txt.indexOf("of");
			int s2=txt.indexOf("items");
			String value1=txt.substring(s1+3,s2-1);
			System.out.println(value1);
			int x=Integer.parseInt(value1);

			if(x%15!=0)
			{     z=x/15+1;
			System.out.println("page counting will be "+ z);
			}
			else
			{  
				z=x/15;
				System.out.println("page count will be "+z);
			}

			WebElement tble=driver.findElement(By.xpath("//div[@class='table']"));
			List<WebElement> chk=tble.findElements(By.tagName("tr"));
			System.out.println(chk.size());
			String expected="1 - "+ chk.size() +" of  "+ chk.size() +" items";	
			if(chk.size()<=15)
			{ 
				System.out.println("paging less than 1 page ");
				Assert.assertEquals(txt,expected);
			}
			else
			{
				System.out.println("paging more than 1 page ");
				Assert.assertEquals(txt,"1 - 15 of "+ chk.size()+" items");

			}

			//li count for paging number
			WebElement lip=	driver.findElement(By.xpath("//div[@class='k-pager-wrap k-grid-pager k-widget k-floatwrap']"));
			List<WebElement> buttonCount = lip.findElements(By.tagName("li"));
			System.out.println("List size is: " +buttonCount.size());
			System.out.println(z);
			// Assert.assertEquals(buttonCount.size()-1, z);
			//navigate to all pages
			for(int i=buttonCount.size()-1;i>=1;i--)
			{
				System.out.println(i);
				String z=Integer.toString(i);
				Thread.sleep(1000);
				driver.findElement(By.linkText(z)).click();
				System.out.println("text clicked ");
				String pagingTxt=driver.findElement(By.cssSelector("span.k-pager-info.k-label")).getText();
				System.out.println("page"+i+"text is: "+pagingTxt);  
			}	

			break;

		case "VERIFYHEADERVALUE":
			WebElement tble1=driver.findElement(this.getObject(p, objectname, objectType));
			List<WebElement> chk1=tble1.findElements(By.tagName("th"));
			System.out.println(chk1.size());
			for(int i=1;i<=chk1.size();i++)
			{
				String header_name=	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div/div[1]/div/div/div[1]/div/table/thead/tr/th["+i+"]")).getAttribute("data-title");
				System.out.println(header_name);
			}
			break;

		case "WRITEVALUE":
			String gettxt=driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
			System.out.println(gettxt);
			//Michaels Companies Inc_MIK_Consumer_NY
			String companyname=gettxt+"_MIK_Consumer_NY.xlsx";
			FileInputStream file = new FileInputStream(new File("C:\\Users\\chaman.preet\\Documents\\C data\\git\\CompsBuilder_final\\upload\\Michaels Companies Inc_MIK_Consumer_NY.xlsx"));
			System.out.println("open file ");
			XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
			System.out.println("open workbook");
			XSSFSheet sheet1 = yourworkbook.getSheet("UT");
			System.out.println("open sheet");
			// b/s source
			Row row = sheet1.getRow(33);
			System.out.println("get row");
			Cell column = row.getCell(3);
			System.out.println(column.toString());
			column.setCellValue("34.0x");
			System.out.println(column.toString());
			//updated by 
			Row row1 = sheet1.getRow(26);
			System.out.println("get row");
			Cell column1 = row1.getCell(3);
			System.out.println(column1.toString());
			column1.setCellValue("Sweta Singh");
			System.out.println(column1.toString());
			//filliing date 
			Row row2 = sheet1.getRow(44);
			System.out.println("get row");
			Cell column2 = row2.getCell(3);
			CellStyle cellStyle = yourworkbook.createCellStyle();
			CreationHelper createHelper = yourworkbook.getCreationHelper();
			cellStyle.setDataFormat(
					createHelper.createDataFormat().getFormat("mm/dm/yyyy "));

			column2.setCellValue(new Date());
			column2.setCellStyle(cellStyle);
			//  System.out.println(column2.toString());
			column2.setCellValue(new Date());
			column2.setCellStyle(cellStyle);
			// System.out.println(column2.toString());
			//updated date 
			Row row3 = sheet1.getRow(3);
			System.out.println("get row");
			Cell column3 = row3.getCell(3);
			column3.setCellValue(new Date());
			column3.setCellStyle(cellStyle);
			file.close();
			FileOutputStream out = 
					new FileOutputStream(new File("C:\\Users\\chaman.preet\\Documents\\C data\\git\\CompsBuilder_final\\upload\\Michaels Companies Inc_MIK_Consumer_NY.xlsx"));
			yourworkbook.write(out);
			out.close();
			break;


		case "READVALUE":

			FileInputStream fileRead = new FileInputStream(new File("C:\\Users\\chaman.preet\\Documents\\C data\\git\\CompsBuilder_final\\upload\\Michaels Companies Inc_MIK_Consumer_NY.xlsx"));
			//System.out.println("open file ");
			XSSFWorkbook yourworkbookRead = new XSSFWorkbook(fileRead);
			//System.out.println("open workbook");
			XSSFSheet sheetRead = yourworkbookRead.getSheet("UT");
			DataFormatter formatter = new DataFormatter();
			Cell cell = sheetRead.getRow(33).getCell(3);
			bs_Source= formatter.formatCellValue(cell);
			// =  cell.getStringCellValue();
			System.out.println(bs_Source);
			//updated by 
			Row rowby = sheetRead.getRow(26);
			Cell columnby = rowby.getCell(3);
			UpdatedBy=  columnby.getStringCellValue();
			System.out.println(UpdatedBy);
			//updated date
			Row rowdate = sheetRead.getRow(3);
			Cell columndate = rowdate.getCell(3);
			Date Update=  columndate.getDateCellValue();
			Format formatter1 = new SimpleDateFormat("yyyy-MM-dd");
			UpdatedDate = formatter1.format(Update);
			System.out.println(UpdatedDate);
			//filling  date
			Row rowfilling = sheetRead.getRow(42);
			Cell columnfilling = rowfilling.getCell(3);
			Date filling=  columnfilling.getDateCellValue();
			Format formatter11 = new SimpleDateFormat("yyyy-MM-dd");
			fillingDate = formatter11.format(filling);
			System.out.println("filling date in sheet is "+fillingDate);
			break;



		case "GETTEXTVERIFYBS":
			String element1 = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
			try

			{
				String s=element1+".0x";
				Assert.assertEquals(bs_Source, s);
				System.out.println("data match, Proceed !!!");
			}
			catch(Exception e)
			{
				System.out.println("Data do not matche and give exception- " +e.getMessage());
			}
			break;



		case "GETTEXTVERIFYUPDATEDBY":

			String element2 = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
			try
			{
				Assert.assertEquals(UpdatedBy, element2);
				System.out.println("data match, Proceed !!!");
			}
			catch(Exception e)
			{
				System.out.println("Data do not matche and give exception- " +e.getMessage());
			}
			break;


		case "GETTEXTVERIFYUPDATEDDATE":

			String element3 = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
			System.out.println(element3);
			try
			{
				Calendar cal = Calendar.getInstance(); 
				cal.setTime(new SimpleDateFormat("dd-MMM-yyyy").parse(element3)); 
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println("new is "+sdf.format(cal.getTime())); 
				String date=sdf.format(cal.getTime());


				Assert.assertEquals(UpdatedDate, date);
				System.out.println("data match, Proceed !!!");
			}
			catch(Exception e)
			{
				System.out.println("Data do not matche and give exception- " +e.getMessage());
			}
			break;


		case "GETTEXTVERIFYFILLINGDATE":


			String element4 = driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");

			try
			{

				Calendar cal2 = Calendar.getInstance(); 
				cal2.setTime(new SimpleDateFormat("dd-MMM-yyyy").parse(element4)); 
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
				System.out.println("new filling is is "+sdf2.format(cal2.getTime())); 
				String date1=sdf2.format(cal2.getTime());


				Assert.assertEquals(fillingDate, date1);
				System.out.println("data match, Proceed !!!");
			}
			catch(Exception e)
			{
				System.out.println("Data do not matche and give exception- " +e.getMessage());
			}
			break;




		case"HOLDTEXT":

			hold=driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");
			System.out.println(hold);

			break;

		case "VERIFYTEXTAFTERDELE":


			if(driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML").matches(hold))
			{
				System.out.println("fail");
				Assert.fail();

			}



			else
			{
				System.out.println("pass");

			}

			break;




		case "TOTALCOUNTOFCOMPANY":

			String txt11=  driver.findElement(this.getObject(p, objectname, objectType)).getText();
			// String txt=	driver.findElement(By.cssSelector("span.k-pager-info.k-label")).getText();
			System.out.println(txt11);
			//s1.substring(s1.lastIndexOf("."));
			int s11=txt11.indexOf("of");
			int s21=txt11.indexOf("items");
			String value11=txt11.substring(s11+3,s21-1);

			totalnoofcompany=Integer.parseInt(value11);
			System.out.println("total count"+totalnoofcompany );





			//	WebElement tble11=driver.findElement(this.getObject(p, objectname, objectType));
			//	List<WebElement> chk11=tble11.findElements(By.tagName("tr"));
			//	totalnoofcompany=chk11.size();
			//	System.out.println("total companies :"+totalnoofcompany);
			//	

			break;


		case "VERIFYCOUNTAFTERDELETE":

			String txt1=  driver.findElement(this.getObject(p, objectname, objectType)).getText();
			// String txt=	driver.findElement(By.cssSelector("span.k-pager-info.k-label")).getText();
			System.out.println(txt1);
			//s1.substring(s1.lastIndexOf("."));
			int s111=txt1.indexOf("of");
			int s211=txt1.indexOf("items");
			String value111=txt1.substring(s111+3,s211-1);
			System.out.println(value111);
			int x1=Integer.parseInt(value111);



			if(x1==totalnoofcompany-1)
			{
				System.out.println("company deleted successfully");	

			}
			else
			{
				System.out.println("count should be decreased ");	
				Assert.fail();
			}



			break;



		case "PAGINGONPOPUP":


			// paging start here 
			String txt111=  driver.findElement(this.getObject(p, objectname, objectType)).getText();
			// String txt=	driver.findElement(By.cssSelector("span.k-pager-info.k-label")).getText();
			System.out.println(txt111);
			//s1.substring(s1.lastIndexOf("."));
			int s1111=txt111.indexOf("of");
			int s2111=txt111.indexOf("items");
			String value1111=txt111.substring(s1111+3,s2111-1);
			System.out.println(value1111);
			int x11=Integer.parseInt(value1111);

			if(x11%15!=0)
			{     z=x11/15+1;
			System.out.println("page counting will be "+ z);
			}
			else
			{  
				z=x11/15;
				System.out.println("page count will be "+z);
			}

			WebElement tble11=driver.findElement(By.xpath("//div[@class='table']"));
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
				Assert.assertEquals(txt111,"1 - 15 of "+ x11 +" items");

			}





			//li count for paging number
			WebElement lip1=	driver.findElement(By.xpath("//div[@class='k-pager-wrap k-grid-pager k-widget k-floatwrap']"));
			List<WebElement> buttonCount1 = lip1.findElements(By.tagName("li"));
			System.out.println("List size is: " +buttonCount1.size());
			System.out.println(z);
			Assert.assertEquals(buttonCount1.size()-1, z);

			// //html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr["+i+"]/td[11]/a[4]/span")); 

			//navigate to all pages
			for(int i=buttonCount1.size();i>1;i--)
			{
				System.out.println("li is"+i);
				String z=Integer.toString(i);
				Thread.sleep(1000);
				driver.findElement(By.xpath("html//body//div[18]//div[2]//div//div//div[1]//div//div//div[3]//ul//li["+i+"]")).click();
				System.out.println("text clicked ");
				String pagingTxt=driver.findElement(By.xpath(" //div[@id='grid_modal']/div[3]/span")).getText();
				System.out.println("page"+i+"text is: "+pagingTxt);  


				//   html/body/div[18]/div[2]/div/div/div[1]/div/div/div[3]/ul/li[3]/a
				//   html/body/div[18]/div[2]/div/div/div[1]/div/div/div[3]/ul/li[2]/span


			}	

			break;





		case "GETTEXTLOCKCOMPANY":
			companylock=driver.findElement(this.getObject(p, objectname, objectType)).getAttribute("innerHTML");


			break;


		case "GETROW":

			WebElement el=driver.findElement(this.getObject(p, objectname, objectType));
			//WebElement el=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[9]/td[3]"));

			List<WebElement> licount = el.findElements(By.tagName("i"));	

			if(licount.size()>1)
			{
				for(int i=licount.size();i>=2;i--)
				{
					WebElement li=driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div[2]/div/div/div[2]/div[5]/div/div/div[2]/table/tbody/tr[9]/td[3]/i["+i+"]"));
					String clss=li.getAttribute("class");
					String title=li.getAttribute("title");
					System.out.println(li);
					System.out.println(title);
					Assert.assertEquals(clss, "glyphicon glyphicon-lock pink");
					Assert.assertEquals(title,"Company locked by mala gupta");
				}

			}
			else
			{
				System.out.println("company not locked");
			}


			break;


		default:
			break;
		}
	}
}




















