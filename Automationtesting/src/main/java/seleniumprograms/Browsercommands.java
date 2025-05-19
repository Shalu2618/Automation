package seleniumprograms;

public class Browsercommands extends Base {
	
	public void browsercommands()
	{
		String title=driver.getTitle();              // here we use retruntype syntax used in java and it is used to get the title of the page,here we used the data type as string,title is the object name,gettitle is a method
        System.out.println(title);
        String currenturl=driver.getCurrentUrl();     // used to get the current url of current  page,currenturl is the object name
        System.out.println(currenturl);        
        String pagesource=driver.getPageSource();    //used to get the html code of the current page, page source is the object name
        System.out.println(pagesource);  
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browsercommands commands=new Browsercommands();
		commands.initiliseBrowser();
		commands.browsercommands();
		commands.closeandquit();
		
		
	}

}
