import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Petstore {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        driver.findElement(By.cssSelector("a:nth-child(9) > img")).click();
        driver.findElement(By.linkText("Return to Main Menu")).click();
    }
}