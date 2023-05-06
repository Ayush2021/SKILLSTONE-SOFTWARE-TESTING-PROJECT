import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demoblaze {
    public static void main(String[] args) {

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        // Click the link for the "Samsung galaxy s6" product
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.linkText("Add to cart")).click();
        driver.switchTo().alert().getText().equals("Product added");
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.cssSelector(".btn-success")).click();

        // Fill in the customer information form
        driver.findElement(By.id("name")).sendKeys("AYUSH");
        driver.findElement(By.id("country")).sendKeys("INDIA");
        driver.findElement(By.id("city")).sendKeys("BHOPAL");
        driver.findElement(By.id("card")).sendKeys("ABC123");
        driver.findElement(By.id("month")).sendKeys("APRIL");
        driver.findElement(By.id("year")).sendKeys("2023");

        // Submit the customer information form
        driver.findElement(By.cssSelector("#orderModal .btn-primary")).click();
        driver.findElement(By.cssSelector(".confirm")).click();
        driver.quit();
    }
}