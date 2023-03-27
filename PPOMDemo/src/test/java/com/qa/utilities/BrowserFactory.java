package com.qa.utilities;





import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {

	


	WebDriver driver;
	
	public static WebDriver openApplication(WebDriver driver, String browser, String url) {  //this Method
    //will return us webdriver
		//WebDriverManager.chromedriver().setup();

		if(browser.equalsIgnoreCase("chrome")) 
		{ 
		System.setProperty("webdriver.chromedriver.driver", // can be used both chromedriver or only chrome
				"C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\Andromeda2\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver(); 

 
	}

	
	else if(browser.equalsIgnoreCase("firefox")) 
	{ 
	System.setProperty("webdriver.firefoxdriver.driver",  // can be used both firefoxdriver or deckodriver or only firefox
			"C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\Andromeda2\\Driver\\geckodriver.exe"); 
	driver = new FirefoxDriver(); 

	}

	else if(browser.equalsIgnoreCase("edge")) 
	{ 
	System.setProperty("webdriver.edgedriver.driver", // can be used only edgedriver
			"C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\Andromeda2\\Driver\\msedgedriver.exe"); 
	driver = new EdgeDriver(); 
	}



	else 
	{ 
	System.out.println("This browser is not supported"); 
	}


	
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



		driver.get(url); 
		return driver;

// we can not run from here.have to go to TestBanking and  run from  test banking 
	
	
	
}
	
	}
