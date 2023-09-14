import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        WebElement findInput = driver.findElement(By.className("login_login__3EHKB")); // h2 - it is tag name
//       System.out.println(findInput.findElement(By.name("placeholder")));

        WebElement findInput = driver.findElement(By.cssSelector("button"));
        System.out.println(findInput.getText());

        WebElement findByClass = driver.findElement(By.cssSelector(".login_login__3EHKB"));
        System.out.println(findByClass.getText());

        WebElement findById = driver.findElement(By.cssSelector("#root"));
        System.out.println(findById.getAttribute("class"));

//        WebElement findById1 = driver.findElement(By.cssSelector("#root"));
//        System.out.println(findById1.findElement(By.linkText("HOME")));

        WebElement findByText = driver.findElement(By.partialLinkText("HOME"));

        WebElement findByName = driver.findElement(By.name("registration"));
        System.out.println(findByName.getAttribute("type"));

        WebElement findByteg = driver.findElement(By.tagName("button"));
        System.out.println(findByteg.getAttribute("name"));

        WebElement findByNamez = driver.findElement(By.cssSelector("[name='login']"));
        System.out.println(findByNamez.getTagName());


        driver.quit();
    }


}
