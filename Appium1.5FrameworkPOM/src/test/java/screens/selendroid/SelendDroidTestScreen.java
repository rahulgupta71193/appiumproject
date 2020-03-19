package screens.selendroid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;

public class SelendDroidTestScreen extends ScreenBase {
	
	@AndroidFindBy(id="io.selendroid.testapp:id/my_text_field")
	public WebElement textField;

	
	public SelendDroidTestScreen(AppiumDriver driver) {
		super(driver);
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	public void typeData(String data){
		
		textField.sendKeys(data);
		Assert.fail();
		
	}
	

}
