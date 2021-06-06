package starter.pageobjects;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPageObjects extends UIInteractionSteps {


    private By userName = By.name("username");
    private By password = By.name("password");
    private By btn_Login = By.xpath("//input[@class='button']");


    @Step
    public void SetUsername(String Username) {
        find(userName).sendKeys(Username);
    }

    @Step
    public void SetPassword(String text) {
        find(password).sendKeys(text);
    }

   @Step
    public void ClickSubmit() {
        find(btn_Login).click();
    }

   @Step
    public void enterUserNameAndPasswordAndClickSubmit(String u, String p) {
        SetUsername(u);
        SetPassword(p);
        ClickSubmit();
    }

    @Step
    public void validateLoginIsSuccess(){
       Assert.assertEquals("ParaBank | Accounts Overview",getDriver().getTitle());
    }
}



