package automation_Course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        System.out.println(driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles){
            System.out.println(handle);
        }

        driver.switchTo().window(mainWindow);
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
