package testpkg;

import org.testng.annotations.Test;
import pagepkg.Baseclass;
import pagepkg.Peachmodepage;

public class Peachmodetest extends Baseclass
{

    private Peachmodepage peachmodepage;

    @Test
    public void Peachmodetest() throws InterruptedException {
    	
    	
    	
    	
    	
        peachmodepage = new Peachmodepage(driver);
        peachmodepage.click();
        peachmodepage.Product();
        peachmodepage.Quantity();
        peachmodepage.Addtocart();
        peachmodepage.Buynow();
        peachmodepage.information();
        peachmodepage.login();
        
        
        }
}



