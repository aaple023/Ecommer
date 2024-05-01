import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Career {
    public static WebDriver driver;

    @BeforeClass
    public void log() {
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }

    @Test
    public void lunch() throws InterruptedException {
        WebElement footers = driver.findElement(By.xpath("//footer"));
        WebElement col = footers.findElement(By.xpath("//footer //div[@class='col-sm-3'][1]"));
        List<WebElement> link = col.findElements(By.tagName("a"));
        List<WebElement> link1 = footers.findElements(By.tagName("a"));
        // List<WebElement> link =driver.findElements(By.xpath("//footer//div[@class='row']//div[1] //ul/li"));
        JavascriptExecutor jn = (JavascriptExecutor) driver;
        jn.executeScript("window.scrollBy(0,1000)");
        for (int i = 0; i < link.size(); i++) {
            String dum = Keys.chord(Keys.CONTROL,Keys.ENTER);
            col.findElements(By.tagName("a")).get(i).sendKeys(dum);
        }
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


    }

    @Test
    public void run() throws IOException {
        WebElement footers = driver.findElement(By.xpath("//footer"));
        List<WebElement> link1 = footers.findElements(By.tagName("a"));
        JavascriptExecutor jn = (JavascriptExecutor) driver;
        SoftAssert a=new SoftAssert();
        jn.executeScript("window.scrollBy(0,1000)");
        for (WebElement linkd:link1) {
          String url=  linkd.getAttribute("href");
            HttpURLConnection connection=(HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
         int respondCode= connection.getResponseCode();
        a.assertTrue(respondCode<400,"it is broken code"+linkd.getText()+" fails" +respondCode);
        }
        a.assertAll();
    }
}