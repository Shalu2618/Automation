package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {     // if u want to locate any filed from the page we want to click the particular field then click right side then click inspect then click reight side top arrow of DOM structure then it will be blue then again clik the particular field we will get the  html code after that take id value and copy that value  then press ctrl+f then will appear the value in down searching bar and by  using up arrow and down arrow we can identify how much id value will be same in the html code. 
	
   public void idlocator()
    {
	   WebElement messagefield=driver.findElement(By.id("single-input-field")); // by is class name and id()is a method name, webelemet is an interface, elmemnt name is messagefield 
	   WebElement showfield=driver.findElement(By.id("button-one"));
	   WebElement inputfield=driver.findElement(By.id("value-a"));
	   WebElement valuefield=driver.findElement(By.id("value-b"));
	   WebElement totalfield=driver.findElement(By.id("button-two"));
	
	    }
   public void classlocator()
   {
	  WebElement messagefield=driver.findElement(By.className("form-control")); // same method we followed in id locator for choosing class loactor
   
   }
	
   public void namelocator()
   {
	   WebElement messagefield=driver.findElement(By.name("viewport")); // if we are inspecting the name locator we didn't get then we press ctrl+f and type name in search bar then enter then we will get the name value then copy that value and paste in to this.
       WebElement inputfield=driver.findElement(By.name("description"));
   }
   
   public void linktext()
   {
	   WebElement checkboxdemo=driver.findElement(By.linkText("check-box-demo.php")); // if we want any page link just right click the particular page then inspect then (href=)clik = then copy and press ctrl+f then paste in to search bar then check if it is  1 of 1 then paste into this.
	   WebElement radiobuttonsdemo=driver.findElement(By.linkText("radio-button-demo.php")); 
	   
   }
   public void partiallinktext()
   {
	   WebElement radiobuttonsdemo=driver.findElement(By.partialLinkText("radio-button"));
       
   }
   
   public void cssselector()    // tag and class
   {
	   WebElement checkboxdemo=driver.findElement(By.cssSelector("input.form-check-input"));
   }
   
   public void cssselectors()   // tag and id
   {
	  WebElement  radiobuttonsdemo=driver.findElement(By.cssSelector("button#button-one"));
   }
   
   public void cssselectorsatrribute()  // tag and attribute
   {
	   WebElement radiobuttonsdemo=driver.findElement(By.cssSelector("button[id=button-one]"));
       WebElement selectinput=driver.findElement(By.cssSelector("select[id=single-input-field]"));
   
   }
   
   public void cssselectorsatrributes()  // tag ,class and attribute
   {
	   WebElement ajaxformsubmission=driver.findElement(By.cssSelector("input.form-control[id=subject]"));
	   WebElement ajaxformsubmission=driver.findElement(By.cssSelector("")
   
   }
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
