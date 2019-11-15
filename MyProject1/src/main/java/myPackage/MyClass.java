package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

//import com.sun.tools.javac.util.Assert;


public class MyClass {
		
	public static void main(String[] args) {
			
	System.setProperty("webdriver.chrome.driver", "C:/Users/academia/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
			
	driver.get("http://automationpractice.com/index.php");
			
	driver.manage().window().maximize();
	
	String str = driver.getCurrentUrl();
	System.out.println("The current URL is: " + str);
	String busqueda = "blouses";
	String valida = "\"BLOUSES\"";
	driver.findElement(By.linkText("Women")).click();
	driver.findElement(By.linkText("Tops")).click();
	driver.findElement(By.id("layered_id_attribute_group_3")).click();
	//driver.findElement(By.id("layered_id_attribute_group_8")).click();
	//driver.findElement(By.id("selectProductSort")).click();
	Select dropdown = new Select(driver.findElement(By.id("selectProductSort")));
	dropdown.selectByVisibleText("Price: Lowest first");
	driver.findElement(By.id("search_query_top")).sendKeys(busqueda);
	driver.findElement(By.name("submit_search")).click();
	if((driver.findElement(By.className("lighter")).getText().contentEquals(valida))){
		System.out.println("Validación correcta");
	} else { System.out.println("Texto no coincide");
	}
	driver.quit();
	
	}
	
}
