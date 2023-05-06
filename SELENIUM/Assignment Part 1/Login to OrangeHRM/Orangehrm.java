import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orangehrm {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector(".oxd-button")).click();
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.linkText("Dashboard")).click();
        driver.findElement(By.cssSelector(".orangehrm-todo-list-item:nth-child(4) > .oxd-text")).click();
        driver.findElement(By.linkText("Dashboard")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
}