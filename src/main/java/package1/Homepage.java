package package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Womens;
	
	public Homepage(){
	PageFactory.initElements(driver, this);

	}
	public WebElement women() {
		return Womens;
		
	}



}
