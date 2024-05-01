package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;



    @BeforeMethod
    public void setup() throws IOException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable window popup ");
        Properties por=new Properties();
        File f=new File("/home/amit/IdeaProjects/demo0/untitled0986/src/test/java/Ecommer/src/main/java/pac/config.properties");
        FileInputStream fileInputStream=new FileInputStream(f);
        por.load(fileInputStream);
        driver=null;
        String browser= por.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();

        }
        else {
            System.out.println("please provide browser name");
        }
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    @AfterMethod
    public void closeUp(){
        driver.close();
    }

}
