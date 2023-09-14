package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumSccIlcaro {
    WebDriver driver;
    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // ждем время для поиска

//        WebElement h2TextElement = driver.findElement(By.cssSelector("h2"));// h2 - it is tag name
//        System.out.println(h2TextElement.getText());
//
        WebElement h2TextElementByClass = driver.findElement(By.className("subtitle"));
        System.out.println(h2TextElementByClass.getText());
//
//        WebElement h2TextElementByClassName = driver.findElement(By.cssSelector(".subtitle"));
//        System.out.println(h2TextElementByClassName.getText());
//
//        WebElement inputCityById = driver.findElement(By.cssSelector("#city"));
//        System.out.println(inputCityById.getAttribute("type"));
        WebElement inputCityByIdDir = driver.findElement(By.id("city"));
System.out.println(inputCityByIdDir.getAttribute("type"));
//        WebElement h2ByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));
//        System.out.println(h2ByText);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement xpath2 = driver.findElement(By.xpath(""));


        driver.quit();
    }
}
