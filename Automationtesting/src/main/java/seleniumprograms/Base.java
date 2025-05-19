package seleniumprograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	 
	WebDriver driver;                               // global declaration
	
	public void initiliseBrowser()                  //instance method 
	{
    	 driver=new ChromeDriver();             // we are given globally declaration webdriver so here we not used and webdriver is an inbuilt interface in selenium- it is used to open the chrome browser   
	//	WebDriver driver=new EdgeDriver();      //  inbuilt interface in selenium- it is used to open the edge browser                        
	//	WebDriver driver=new FirefoxDriver();   //  inbuilt interface in selenium- it is used to open the firefox browser
	
    	driver.get("https://selenium.qabible.in/index.php");     // get is an abstract method in the webdriver
    	driver.manage().window().maximize();                     // it is used to maximize the particular page
	    	
	}
	public void closeandquit()  
	{
	  driver.close();	            // used to close the currently opened  page.
	  driver.quit();	            // used to close the all opened pages. normally we used quit method in our projects.
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base=new Base();                // object creation for the class
		base.initiliseBrowser();             // call instance method
        base.closeandquit();  
		
	}

}
