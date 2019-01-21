package operation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void capturescreenshot(WebDriver driver, String screenshotname,String Filepath)
	{
		try
		{
			// no change in this file 
			
			File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scr, new File(Filepath+screenshotname+".png"));
		
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot" +e.getMessage());
		}
	}

	
	public static String capture(WebDriver driver,String screenShotName) throws IOException 
    {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+screenShotName+".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);        
                     
        return dest;
    }
	
}
