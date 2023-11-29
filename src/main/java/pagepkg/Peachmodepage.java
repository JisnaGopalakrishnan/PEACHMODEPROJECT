package pagepkg;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Peachmodepage {

    private WebDriver driver;

    public Peachmodepage(WebDriver driver) {
        this.driver = driver;
    }

    public void click() {
        WebElement cottosareeclick = driver.findElement(By.xpath("//*[@id=\"block-template--16071678656733__16544044720bed0206-1654404472a646c66e-0\"]/a/img"));
        cottosareeclick.click();
    }

    public void Product() throws InterruptedException {
        Thread.sleep(10000);
        WebElement Product = driver.findElement(By.xpath("//*[@id=\"img_id_8181774876893\"]/img[2]"));
        Product.click();
    }
    
    
    public void Quantity()
    {
    	WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--15880464695517__main\"]/section/div/div/div/div[1]/div[1]/quantity-selector/button[2]"));
    	Quantity.click();
    }

   
    public void Addtocart() throws InterruptedException {
      
        Thread.sleep(2000);
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"AddToCart\"]"));
        addToCartButton.click();
    }
    
    public void Buynow() throws InterruptedException
    {
    	Thread.sleep(2000);
    	WebElement Buynowbutton= driver.findElement(By.xpath("//*[@id=\"mini-cart\"]/footer/button/span[1]"));
    	Buynowbutton.click();
    }
    
    public void information()
    {
    	WebElement email = driver.findElement(By.xpath("//input[@id='checkout_email_or_phone']"));
        email.sendKeys("abc@gmail.com");
        
        
   
        
        /*WebElement countryElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[1]/div[1]/div/div"));

        countryElement.click();
        WebElement indiaOption = driver.findElement(By.xpath("//div[contains(text(),'India')]"));
        indiaOption.click();*/
        
        WebElement firstname = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_first_name\"]"));
        firstname.sendKeys("abc");
        
        WebElement lastname = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_last_name\"]"));
        lastname .sendKeys("def");
        
        WebElement address = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address1\"]"));
        address.sendKeys("abcdef");
        
        WebElement landmark = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_address2\"]"));
        landmark .sendKeys("wertyu");
        
        WebElement city = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_city\"]"));
        city .sendKeys("werty");
        
        WebElement pincode = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_zip\"]"));
        pincode.sendKeys("123456");
       
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"checkout_shipping_address_phone\"]"));
        phone.sendKeys("9876543210");
        
        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[1]/div[2]/div[2]/div/div[2]/div/div"));
        checkbox.click();
        
        //WebElement continuebutton = driver.findElement(By.xpath("//*[@id=\"continue_button\"]"));
        //continuebutton.click();
        
        WebElement returntocart = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[1]/form/div[2]/a/span"));
        returntocart.click();
        
        
    }
    
    public void login() {
        WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/store-header/div[2]/div/div/ul/li[2]/a"));
        loginLink.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"customer[email]\"]"));
        email.sendKeys("jisnagopalakrishnan@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"customer[password]\"]"));
        password.sendKeys("Jisna123#");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button/span[1]"));
        loginButton.click();
    }
}

