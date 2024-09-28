package senond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sel {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("rohit sharma");
		driver.findElement(By.className("gNO89b")).click();
		driver.close();

	}

}
