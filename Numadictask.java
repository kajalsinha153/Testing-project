public class Test {  
  
    public static void main(String[] args) {  
      
            
       System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
          
                
        WebDriver driver=new ChromeDriver();  
          
        driver.get("https://jobs.numadic.com/jobs/Careers) ;
          
          driver.manage().window().maximize();
//verify header text
  String actual=driver.findElement(By.xpath("//h2[text()='JOIN OUR CREW']")).getText();
  Assert.assertEquals(actual,"JOIN OUR CREW");

//select engineering from drop down
Select s=new Select(driverfindElement(By.xpath("//div[@id='lytedropdownfreezelayer']");
s.selectByVisibleText("Engineering");
driver.findElement(By.xpath("//a[text()='QA Engineer']")).click();

 
//verify title
String title=driver.findElent(By.xpath("//p[text()='Numadic Iot Pvt. Ltd.']")).getText();
Assert.assertEquals(title,"Numadic Iot Pvt. Ltd.");

//verify button and click action

boolean button=driver.findElement(By.xpath("//lyte-button[@id='detail-page-applybtn']//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess']")).isDisplayed();
Assert.assertTrue(button,True);


driver.findElement(By.xpath("//lyte-button[@id='detail-page-applybtn']//button[@class='lyte-button lyteBackgroundColorBtn lyteSuccess']")).click();

//verify validation all field
Select s=new Select(driverfindElement(By.xpath("//div[@aria-controls='Salutation']//span]");
s.selectByVisibleText("Mrs.");


WebElement firstName=driver.findElement(By.xpath("//lyte-input[@data-zcqa='manual_First_Name'])).sendkeys("Kajal");
WebElement lastName=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Last_Name']").sendkeys("sinha");
WebElement emailAddress=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Email']").sendkeys("sinhakajal153@gmail.com");
WebElement mobileNo=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Mobile']").sendkeys("9019842678");
WebElement street=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Street']").sendkeys("3rd");
WebElement city=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Street']").sendkeys("Bangalore");
WebElement country=driver.findElememt(By.xpath("//lyte-input//div//input[@class='cxBorderBottom 'and @input='lyte-input => input']").sendkeys("India");

Select s1=new Select(driver.findElememt(By.xpath("////lyte-drop-button[@data-zcqa='manual_Current_Job_Title']"));
s.selectByVisibleText("Fresher");

WebElement skills=driver.findElememt(By.xpath("//ul[@class='skl-selected-skill']").sendkeys("Testing");
WebElement currentCTC=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Current_CTC']").sendkeys("5.2");
WebElement expectedCTC=driver.findElememt(By.xpath("//lyte-input[@data-zcqa='manual_Expected_CTC']").sendkeys("10");
WebElement submitApp=driver.findElememt(By.xpath("//lyte-yield[text()='Submit Application']']").click();
driver.close();
}
}






























          