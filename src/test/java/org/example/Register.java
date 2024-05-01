package org.example;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;



public class Register {
    static WebDriver driver;
    @BeforeClass
    public  void register(){
        driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @DataProvider(name = "dataGet")
    public Object[][] dataGet() throws IOException, InvalidFormatException {
        String sheetname="ram";
        String ExcelPath="/home/amit/IdeaProjects/demo0/untitled0986/src/test/java/Ecommer/src/test/java/org/example/roop1.xlsx" ;
        XSSFWorkbook workbook=new XSSFWorkbook(ExcelPath);

        XSSFSheet sheetName = workbook.getSheet(sheetname);
      int rowCount=  sheetName.getLastRowNum();
      int colCount=sheetName.getRow(rowCount).getLastCellNum();
      Object[][] data=new Object[rowCount-1][colCount];
      for (int i=1;i<rowCount-1;i++){
         XSSFRow row=sheetName.getRow(i+1);
         for (int j=0;j<colCount;j++){
            XSSFCell cell= row.getCell(j);
           data[i][j] =dataFormatter.createFormat(cell);


         }

      }
 return data;
    }
    DataFormatter dataFormatter=new DataFormatter();
    @Test(dataProvider = "dataGet")
    public void setUP(String Full_Name,String Last_Name,String Address,String Email){
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Full_Name);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Last_Name);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys(Address);
        driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).clear();
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys(Email);
        driver.findElement(By.xpath("(//input[@type='email'])[1]")).clear();
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

    }
}