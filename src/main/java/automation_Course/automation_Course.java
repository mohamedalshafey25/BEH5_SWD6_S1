package automation_Course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class automation_Course {
    public static void main(String[] args) {

        WebDriver driver;
        Scanner input = new Scanner(System.in);
        String browser = input.nextLine();

        switch (browser) {
            case "chrome" :
                driver = new ChromeDriver();
                break;
            case "edge" :
                driver = new EdgeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getTitle());

    }
}
