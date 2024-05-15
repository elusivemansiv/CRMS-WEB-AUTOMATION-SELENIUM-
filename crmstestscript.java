package crms.selenium.test;

////////////LOGIN TEST //////////////

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class crmstestscript {

@Test
public void t_01_validate_login_crms_app() {

  System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
driver.get("http://127.0.0.1:8000/login");

//Find user name
driver.findElement(By.name("email")).sendKeys("mansiv@gmail.com");

//Password is set
driver.findElement(By.name("password")).sendKeys("123456");

driver.findElement(By.className("btn-primary")).click();


String expected_title = "CRMS- Dashboard";
String actual_title = driver.getTitle();

//Check point
if (expected_title.equals(actual_title)) {
System.out.println("Login Successfull");
}else {
System.out.println("Login Failed");
}
	

}

}


//import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//
//
//public class crmstestscript {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//	System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.manage().window().maximize();
//
//
//((WebDriver) driver).get("http://127.0.0.1:8000/registration");
//
////Find user name
//
//((WebDriver) driver).findElement(By.id("Renter")).click();
//
//((WebDriver) driver).findElement(By.name("first_name")).sendKeys("Mansib");
//
//((WebDriver) driver).findElement(By.name("last_name")).sendKeys("Ahsan");
//
//((WebDriver) driver).findElement(By.name("username")).sendKeys("Gdanger");
//
//((WebDriver) driver).findElement(By.name("email")).sendKeys("mansiv@gmail.com");
//
//
//WebElement dateBox = ((WebDriver) driver).findElement(By.xpath("//form//input[@name='Date_of_birth']"));
//
//
//
//dateBox.sendKeys("092");
//
//
//
//dateBox.sendKeys(Keys.TAB);
//
//
//
//dateBox.sendKeys("2000");
//
//
//
//((WebDriver) driver).findElement(By.id("male")).click();
//
//((WebDriver) driver).findElement(By.name("phone_number")).sendKeys("017894656624");
//
//((WebDriver) driver).findElement(By.name("address")).sendKeys("Niketan, Gulshan");
//
//((WebDriver) driver).findElement(By.name("nid_number")).sendKeys("1513307312");
//
//((WebDriver) driver).findElement(By.name("dl_number")).sendKeys("A01932387");
//
////Password is set
//((WebDriver) driver).findElement(By.name("password")).sendKeys("123456");
//
//WebElement browse = ((WebDriver) driver).findElement(By.xpath("//input[@id='pp']"));
//
//browse.sendKeys("C:\\Users\\Asus\\OneDrive\\Desktop\\1670694692.jpg");
//
//((WebDriver) driver).findElement(By.className("btn-primary")).click();
//
//
//String expected_title = "Custom Authentication";
//String actual_title = ((WebDriver) driver).getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Registration Successfull");
//}else {
//System.out.println("Registration Failed");
//}
//	
//
//}
//
//}

//
//
////////////////////CAR ADD TEST ///////////////
//

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//
//
//public class myclass {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://127.0.0.1:8000/login");
//
////Find user name
//driver.findElement(By.name("email")).sendKeys("mansibahsan9@gmail.com");
//
////Password is set
//driver.findElement(By.name("password")).sendKeys("123456");
//
//driver.findElement(By.className("btn-primary")).click();
////Add car
//driver.get("http://127.0.0.1:8000/addNewCar");
//
//driver.findElement(By.name("car_name")).sendKeys("Subaru");
//driver.findElement(By.name("car_model")).sendKeys("B3");
//driver.findElement(By.id("Family")).click();
//driver.findElement(By.name("car_number")).sendKeys("1525646");
//driver.findElement(By.name("rent_price")).sendKeys("3500");
//
//
//WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='car_buy_date']"));
//
//
//
//dateBox.sendKeys("2912");
//
//
//
//dateBox.sendKeys(Keys.TAB);
//
//
//dateBox.sendKeys("2010");
//
//
//WebElement t=driver.findElement(By.xpath("//*[@name='car_color']"));
//
//Select select = new Select(t);
//
//select.selectByVisibleText("Blue");
//
//WebElement t1=driver.findElement(By.xpath("//*[@name='sit_number']"));
//
//Select select1 = new Select(t1);
//
//select1.selectByVisibleText("2");
//
//WebElement m = driver.findElement(By.id("car_details"));
//// enter text
//m.sendKeys("Best");
//
//WebElement browse = driver.findElement(By.xpath("//input[@id='carpic']"));
//
//browse.sendKeys("C:\\Users\\User\\Desktop\\subaru.jpg");
//
//driver.findElement(By.className("btn-primary")).click();
//
//
//String expected_title = "CRMS- Dashboard";
//String actual_title = driver.getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Success");
//}else {
//System.out.println("Failed");
//}
//	
//
//}
//
//}

//////////////Carlist Test ///////////////////////////
//

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//
//
//public class myclass {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://127.0.0.1:8000/login");
//
////Find user name
//driver.findElement(By.name("email")).sendKeys("mansibahsan9@gmail.com");
//
////Password is set
//driver.findElement(By.name("password")).sendKeys("123456");
//
//driver.findElement(By.className("btn-primary")).click();
////Add car
//driver.get("http://127.0.0.1:8000/carlist");
//
//   
//
//String expected_title = "CRMS- Dashboard";
//String actual_title = driver.getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Success");
//}else {
//System.out.println("Failed");
//}
//	
//
//}
//
//}

///////////////////////// Video Upload/////////////////////
//
//

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//
//
//public class myclass {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://127.0.0.1:8000/login");
//
////Find user name
//driver.findElement(By.name("email")).sendKeys("mansibahsan9@gmail.com");
//
////Password is set
//driver.findElement(By.name("password")).sendKeys("123456");
//
//driver.findElement(By.className("btn-primary")).click();
////Add car
//driver.get("http://127.0.0.1:8000/postCarVideo");
//
//WebElement browse = driver.findElement(By.xpath("//input[@name='video']"));
//
//browse.sendKeys("C:\\Users\\User\\Desktop\\VID_20200930124630.mp4");
//
//driver.findElement(By.className("btn-primary")).click();     
//
//String expected_title = "CRMS- Dashboard";
//String actual_title = driver.getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Success");
//}else {
//System.out.println("Failed");
//}
//	
//
//}
//
//}


///////////////////////video list ////////////////
//

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//
//
//public class myclass {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://127.0.0.1:8000/login");
//
////Find user name
//driver.findElement(By.name("email")).sendKeys("mansibahsan9@gmail.com");
//
////Password is set
//driver.findElement(By.name("password")).sendKeys("123456");
//
//driver.findElement(By.className("btn-primary")).click();
////Add car
//driver.get("http://127.0.0.1:8000/video_list");
//
//
//String expected_title = "CRMS- Dashboard";
//String actual_title = driver.getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Success");
//}else {
//System.out.println("Failed");
//}
//	
//
//}
//
//}


/////////////////Notice /////////////////

//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//
//
//public class myclass {
//
//@Test
//public void t_01_validate_login_crms_app() {
//
//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver\\chromedriver.exe");
//WebDriver driver=new ChromeDriver();
//driver.get("http://127.0.0.1:8000/login");
//
////Find user name
//driver.findElement(By.name("email")).sendKeys("mansibahsan9@gmail.com");
//
////Password is set
//driver.findElement(By.name("password")).sendKeys("123456");
//
//driver.findElement(By.className("btn-primary")).click();
////Add car
//driver.get("http://127.0.0.1:8000/notices");
//
//
//String expected_title = "CRMS- Dashboard";
//String actual_title = driver.getTitle();
//
////Check point
//if (expected_title.equals(actual_title)) {
//System.out.println("Success");
//}else {
//System.out.println("Failed");
//}
//	
//
//}
//
//}