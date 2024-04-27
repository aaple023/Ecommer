package BaseOS;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class OsSetUp {
   public static WebDriver driver;
   public  static ExtentReports reports;
   public static ExtentTest test;
   public static ExtentSparkReporter sparkReporter;
    @BeforeClass
    public void setup() throws IOException {
        Properties  p=new Properties();
        File file=new File("/home/amit/IdeaProjects/demo0/untitled0986/src/test/java/Ecommer/src/main/java/Property/config.properties");
        ///home/amit/IdeaProjects/MavenProject/src/main/java/file/properties/config.properties
        FileInputStream fis=new FileInputStream(file);
        p.load(fis);
        driver=null;
        String browser= p.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();

        }
        else {
            System.out.println("provide browser name");
        }


        reports=new ExtentReports();
        sparkReporter=new ExtentSparkReporter("target/Spark.html");
        sparkReporter.config().setReportName("web automation result");
        sparkReporter.config().setDocumentTitle("Test Result");
        reports.attachReporter(sparkReporter);
        reports.setSystemInfo("Tester","neha 2275896");

        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();




    }
    @AfterClass
    public void tear(){
        driver.close();
        driver.quit();



    }
   

    
}
