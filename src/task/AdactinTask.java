package task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AdactinTask {

public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webDriver.chrome.driver","C:\\Users\\kingk\\eclipse-workspace\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	user.sendKeys("Shahitha123");
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("123456");
	WebElement log = driver.findElement(By.xpath("//input[@type='Submit']"));
	log.click();
    WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
    Select place =new Select(location);
    place.selectByValue("Sydney");
    WebElement hotel = driver.findElement(By.xpath("//select[contains(@name,'hotels')]"));
    Select or = new Select(hotel);
    or.selectByIndex(2);
    WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
    Select opt = new Select(room);
    opt.selectByVisibleText("Double");
    WebElement num = driver.findElement(By.xpath("//select[@name='room_nos']"));
    Select drop = new Select(num);
    drop.selectByVisibleText("4 - Four");
    WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
    checkin.sendKeys("18/03/2023");
    WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
    WebElement newroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
    Select one= new Select(newroom);
    one.selectByVisibleText("2 - Two");
    WebElement org = driver.findElement(By.xpath("//select[@name='child_room']"));
    Select pavi = new Select(org);
    pavi.selectByValue("3");
    WebElement done = driver.findElement(By.xpath("//input[@name='Submit']"));
    done.click();
    WebElement ele = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
    ele.click();
    WebElement res = driver.findElement(By.xpath("//input[@type='submit']"));
    res.click();
    WebElement nam = driver.findElement(By.xpath("//input[@name='first_name']"));
    nam.sendKeys("keerthana");
    WebElement amm = driver.findElement(By.xpath("//input[@name='last_name']"));
    amm.sendKeys("k");
    WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
    add.sendKeys("3/1179,ganapathy nagar,trichy");
    WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
    card.sendKeys("1234567812345678");
    WebElement dee = driver.findElement(By.xpath("//select[@name='cc_type']"));
    Select see =new Select(dee);
    see.selectByValue("MAST");
    WebElement key = driver.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
    Select kss = new Select(key);
    kss.selectByValue("2");
    WebElement zzz = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
    Select yyy = new Select(zzz);
    yyy.selectByValue("2015");
    WebElement eee = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
    eee.sendKeys("2345");
    WebElement ccc = driver.findElement(By.xpath("//input[@name='book_now']"));
    ccc.click();
    Thread.sleep(10000);
    TakesScreenshot scrr = (TakesScreenshot)driver;
    File as = scrr.getScreenshotAs(OutputType.FILE);
    File sss = new File ("C:\\Users\\kingk\\eclipse-workspace\\Adactin\\screen\\img2.png");
    FileHandler.copy(as, sss);
    
    
    
    
    
    
	
	
			}
}