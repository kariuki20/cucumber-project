package steps;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import page.SkyBlueBackground;
import page.WhiteBackground;
import util.BrowserFactory;

public class StepDef {
	WebDriver driver;
	LoginPage login;
	SkyBlueBackground skyblue;
	WhiteBackground whitebackground;
	
	@Before
	public void BeforeRun() {
		
		driver=BrowserFactory.startbrowser();
		login=PageFactory.initElements(driver,LoginPage.class);
		skyblue=PageFactory.initElements(driver,SkyBlueBackground.class);
		whitebackground=PageFactory.initElements(driver,WhiteBackground.class);
	}

	@Given  ("^User is on the todo list website$")
	public void User_is_on_the_todo_list_website () {
		driver.get("https://techfios.com/test/101/");
	}	
	 @When("^User clicks on  set skyBlue Background  button $") 
	   public void User_clicks_on_set_skyBlue_Background_button () throws Throwable {
		 skyblue.clickOnSetSkyBlueBackgrondButton();
		 Thread.sleep(2000);
		 
	}
	 @Then("^The background color should change to skyBlue$")
	   public void The_background_color_should_change_to_skyBlue() throws Throwable {
		   TakesScreenshot ts=(TakesScreenshot)(driver);
		   File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(sourceFile, new File("C:\\Users.png"));
		
	
	}
	   @When("^User clicks on the  set White Background Button $") 
	  public void User_clicks_on_the_set_White_Background_Button() throws Throwable {
			whitebackground.clickOnSetWhiteBackgroundButton();
			Thread.sleep(2000);
}
	   @Then("^The Background color Should Change to White$")
	   public void The_Background_color_Should_Change_to_White() {
		   System.out.println("Set backgound button exists");
		   
	   }
	   
	  
	   
}
