package BDD.BaseClassPackege;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openbrowser(){

       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\unnati\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void closebrowser(){
       // driver.quit();
    }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
