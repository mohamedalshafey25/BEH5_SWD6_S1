package automation_Course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);

        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().fullscreen();



    }
}
