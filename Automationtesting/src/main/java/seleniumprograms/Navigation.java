package seleniumprograms;

public class Navigation extends Base {
	
	public void navigationcommand()
	{
		driver.navigate().to("https://www.amazon.in/");  // used to move from  one page to another page, here we use navigation method and to ("url") method
		driver.navigate().back();       // used to move back the previous page
		driver.navigate().forward();    // used to move forward page
	    driver.navigate().refresh();    // used  to refersh the page
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Navigation navigate=new Navigation();
		navigate. initiliseBrowser();
		navigate.navigationcommand();
		
		
	}

}
