package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Baseclass {

    public static WebDriver driver;

    @BeforeTest
    public void setUp() {
    	
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.get("https://peachmode.com/collections/sarees");
        driver.manage().window().maximize();
       
        
        
    }
}