package week3day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag = driver.findElement(By.id("form:conpnl_header"));
		System.out.println(drag.getLocation());
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 150,201).perform();
		System.out.println(drag.getLocation());
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement target = driver.findElement(By.id("form:drop_header"));
		builder.dragAndDrop(source, target).perform();
		System.out.println("Colour After Drop: " + target.getCssValue("background"));
		
		
	}}	
		
		
		
		
		
		
		
		
		