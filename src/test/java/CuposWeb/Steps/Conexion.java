package CuposWeb.Steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Step;

public class Conexion {

	private WebDriver driver;	

	@Before
	@Step
	public WebDriver abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://180.26.136.54:8080/cupos/cupos/login.xhtml");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		return this.driver;

	}
	

}
