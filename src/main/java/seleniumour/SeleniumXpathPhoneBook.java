package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXpathPhoneBook {
    WebDriver driver;

    @BeforeClass
    public void precondition() {
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test1Xpath() {
        driver.findElement(By.xpath("//button[@name='registration']"));
        List<WebElement> buttons = driver.findElements(By.xpath("//button[@name]"));
        System.out.println("size of button:" + buttons.size());

        WebElement findLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        System.out.println(findLogin.getAttribute("class"));

        Assert.assertEquals((findLogin.getAttribute("class")), "active");

        List<WebElement> findHeader = driver.findElements(By.xpath("//a"));
        System.out.println(findHeader.size());
        System.out.println(findHeader.get(2).getText());

        WebElement findEmail = driver.findElement(By.xpath("//*[contains(@name, 'ail')]"));



        Assert.assertTrue(findHeader.get(2).getText().equals("LOGIN"));






    }


    @AfterClass
    public void postCondition() {
        driver.quit();
    }


}
