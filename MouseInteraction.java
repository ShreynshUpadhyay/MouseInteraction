import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {
    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("input.Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT)
                .perform();
        a.moveToElement(driver.findElement(By.cssSelector("a._1TOQfO"))).build().perform();
    }
}
