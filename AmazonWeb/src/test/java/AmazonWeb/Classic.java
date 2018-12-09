package AmazonWeb;

import java.sql.Driver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classic {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "./src/test/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().setPosition(new Point(1921,0));
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in/your-account");
        driver.close();

        
		// TODO Auto-generated method stub

	}

}
