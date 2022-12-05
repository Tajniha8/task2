package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	WebDriver driver= null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("User opens URL");
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.telerik.com/");
		driver.manage().window().maximize();
}

@When("User opens URL {string}")
public void user_opens_url(String string) {
	 System.out.println("User opens URL");
}

@When("clicks on PRICING")
public void clicks_on_pricing() {
	 System.out.println("clicks on pricing");
	 driver.findElement(By.xpath("//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']")).click();
}

@Then("user is navigated to the PRICING banner")
public void user_is_navigated_to_the_pricing_banner() {
	 System.out.println("User is navigated to the pricing banner");
}
@When("User clicks on PRODUCT BUNDLES")
public void user_clicks_on_product_bundles() {
    System.out.println("User clicks on PRODUCT BUNDLES");
    driver.findElement(By.xpath("//span[normalize-space()='Product Bundles']")).click();
}

@Then("user is navigated to the PRODUCT BUNDLE banner")
public void user_is_navigated_to_the_product_bundle_banner() {
	System.out.println("User navigates to PRODUCT BUNDLES");
}
@When("User clicks on INDIVIDUAL PRODUCTS")
public void user_clicks_on_individual_products() throws InterruptedException {
	System.out.println("User clicks on INDIVIDUAL PRODUCTS");
	  driver.findElement(By.xpath("//span[normalize-space()='Individual Products']")).click();
	  Thread.sleep(3000);
}

//@Then("user is navigated to the INDIVIDUAL PRODUCTS banner")
//public void user_is_navigated_to_the_individual_product_banner() {
//	System.out.println("User navigates to INDIVIDUAL PRODUCTS");
//}
@When("user clicks on Web Js Components banner")
public void user_clicks_on_web_js_components_banner() throws InterruptedException {
driver.findElement(By.xpath("//a[normalize-space()='Web JS Components']")).click();
Thread.sleep(2000);
}

@Then("user is navigates to the Web Js Components banner")
public void user_is_navigates_to_the_web_js_components_banner() {

}

@When("user clicks on Web .NET Components banner")
public void user_clicks_on_web_net_components_banner() throws InterruptedException {

driver.findElement(By.xpath("//a[normalize-space()='Web .NET Components']")).click();
Thread.sleep(2000);
}

@Then("user is navigates to the Web .NET Components banner")
public void user_is_navigates_to_the_web_net_components_banner() {

}

@When("user clicks on Desktop Components banner")
public void user_clicks_on_desktop_components_banner() throws InterruptedException {
driver.findElement(By.xpath("//a[normalize-space()='Desktop Components']")).click();
Thread.sleep(2000);
}

@Then("user is navigates to the Desktop Components banner")
public void user_is_navigates_to_the_desktop_components_banner() {

}
@When("user clicks on Mobile Components banner")
public void user_clicks_on_mobile_components_banner() throws InterruptedException {
driver.findElement(By.xpath("//a[normalize-space()='Mobile Components']")).click();
Thread.sleep(2000);
}

@Then("user is navigates to the Mobile Components banner")
public void user_is_navigates_to_the_mobile_components_banner() {

}

@When("user clicks on Demos")
public void user_clicks_on_demos() {
	driver.findElement(By.xpath("//a[@class='TK-Footer-Link'][normalize-space()='Demos']")).click();
}

@Then("user is navigates to the Demos")
public void user_is_navigates_to_the_demos() {
    
}



}


