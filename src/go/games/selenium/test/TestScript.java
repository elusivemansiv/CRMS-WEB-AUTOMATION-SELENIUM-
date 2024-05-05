package go.games.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;




public class TestScript {
    
	@Test
	public void t_01_validate_login_crms_app() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
        driver.get("http://127.0.0.1:8000/login");
        
        //Find user name
        driver.findElement(By.name("email")).sendKeys("hasan9@gmail.com");
        
        //Password is set
        driver.findElement(By.name("password")).sendKeys("12345");
        
        driver.findElement(By.className("btn-primary")).click();
        //Add car
        driver.get("http://127.0.0.1:8000/addNewCar");
        
        driver.findElement(By.name("car_name")).sendKeys("Subaru");
        driver.findElement(By.name("car_model")).sendKeys("B3");
        driver.findElement(By.id("Family")).click();
        driver.findElement(By.name("car_number")).sendKeys("1525646");
        driver.findElement(By.name("rent_price")).sendKeys("3500");
        

        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='car_buy_date']"));

        

        dateBox.sendKeys("2912");

        

        dateBox.sendKeys(Keys.TAB);

        
        dateBox.sendKeys("2010");
        
        
        WebElement t=driver.findElement(By.xpath("//*[@name='car_color']"));
        
        Select select = new Select(t);
        
        select.selectByVisibleText("Blue");
        
        WebElement t1=driver.findElement(By.xpath("//*[@name='sit_number']"));
        
        Select select1 = new Select(t1);
        
        select1.selectByVisibleText("2");
        
        WebElement m = driver.findElement(By.id("car_details"));
        // enter text
        m.sendKeys("Best");
        
        WebElement browse = driver.findElement(By.xpath("//input[@id='carpic']"));
        
        browse.sendKeys("C:\\Users\\Asus\\Downloads\\OIP.jpeg");
        
        driver.findElement(By.className("btn-primary")).click();
        
        
        String expected_title = "CRMS- Dashboard";
        String actual_title = driver.getTitle();
        
        //Check point
        if (expected_title.equals(actual_title)) {
        	System.out.println("Success");
        }else {
        	System.out.println("Failed");
        }
        		

	}

}
