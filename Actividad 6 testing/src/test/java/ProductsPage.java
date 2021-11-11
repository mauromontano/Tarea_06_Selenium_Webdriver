import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement products_label;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart_SauceBackpack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement cart_badge;

    @FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]")
    private WebElement login_error;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu_button;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_button;

    @FindBy(id = "login-button")
    private WebElement login;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shop;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement item_cart;

    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public String getTitle(){
        return this.products_label.getText();
    }

    public void addToCartBackpack(){
        this.addToCart_SauceBackpack.click();
    }

    public String getCardBadge(){
        return this.cart_badge.getText();
    }

    public String getLoginError(){ return this.login_error.getText(); }

    public void pressMenuButton(){
        this.menu_button.click();
    }

    public void pressLogoutButton(){ this.logout_button.click(); }

    public String getLogin(){
        return this.login.getTagName();
    }

    public void pressShopButton(){ this.shop.click(); }

    public String getProductName(){ return this.item_cart.getText(); }
}
