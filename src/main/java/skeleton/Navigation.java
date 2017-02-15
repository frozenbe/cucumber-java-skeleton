package skeleton;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Navigation {
    public void navigate() {

        WebDriver driver = new FirefoxDriver();

        System.out.println("Opening driver");

        driver.get("http://www.universe.com");

    }
}
