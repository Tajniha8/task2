package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pricing {
public WebDriver ldriver;

public Pricing(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
@FindBy(xpath="//a[@class='TK-Menu-Item-Link TK-Item--Selected']")
@CacheLookup
WebElement btnLog;
}
