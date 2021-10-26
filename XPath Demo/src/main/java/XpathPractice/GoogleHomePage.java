package XpathPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user304\\Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //add website url
        driver.get("https://www.google.com");
        String xPath="//input[@title='Search']";
        driver.findElement(By.xpath(xPath)).sendKeys("");
    }
}
