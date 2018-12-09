package AmazonWeb;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Procedures.RetreiveUser;

public class Classic {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);
        driver.manage().window().setPosition(new Point(1921,0));
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in/your-account");
        String [][] post=RetreiveUser.Retreive();
        for  (int j=0;post[j][0]!=null;j++)
        {
        	System.out.println(post[j][0]+"   "+post[j][1]);
        }
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Default Purchase Settings']")));
        act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your Account']")));
        driver.close();

        
		// TODO Auto-generated method stub

	}

}
