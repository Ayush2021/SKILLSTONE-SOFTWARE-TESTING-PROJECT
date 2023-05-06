import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fishadd {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector("#SidebarContent > a:nth-child(1) > img")).click();
        driver.findElement(By.linkText("FI-FW-02")).click();
        driver.findElement(By.linkText("Add to Cart")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.linkText("Confirm")).click();
    }
}