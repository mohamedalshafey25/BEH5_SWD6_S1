package automation_Course;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest {
    String baseUrl = "https://www.saucedemo.com/";
    By usernameLocator = By.cssSelector("[data-test='username']");
    By passwordLocator = By.cssSelector("#password");
    By loginButtonLocator = By.cssSelector("input[data-test='login-button']");
    By errorMessage = By.cssSelector("[data-test='error']");
    WebDriver driver;
    String homePageExpectedPageTitle = "Swag Labs";
    String homePageUrl = "https://www.saucedemo.com/inventory.html";

    @Test
    public void validLoginStandard() {
        // Open URL > Enter UserName > Enter Password > Click Login > Assert page title & URL
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        driver.findElement(usernameLocator).sendKeys("standard_user");
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
        driver.findElement(loginButtonLocator).click();

        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, homePageExpectedPageTitle);
        // assert that button text converted from "Add To Cart" to "Remove"
        driver.quit();
    }

    @Test
    public void invalidLoginStandard() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(baseUrl);
        driver.findElement(usernameLocator).sendKeys("standarduser");
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
        driver.findElement(loginButtonLocator).click();

        String actualUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(actualUrl, homePageUrl);
        WebElement errorMessageElement = driver.findElement(errorMessage);
        Assert.assertTrue(errorMessageElement.isDisplayed());

    }

}


