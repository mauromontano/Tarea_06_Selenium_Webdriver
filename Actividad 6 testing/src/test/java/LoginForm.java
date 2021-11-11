import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{
    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginbutton;

    public LoginForm(WebDriver driver){
        super(driver);
    }

    public void enterUsername(){
        this.username.sendKeys(USERNAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton(){
        this.loginbutton.click();
    }

    public void enterOtherUsername(String user){
        this.username.sendKeys(user);
    }

    public void enterOtherPassword(String pass){
        this.password.sendKeys(pass);
    }

}
