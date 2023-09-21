package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXpathIlcaro {
    WebDriver driver;

    @BeforeClass
    public void precondition() {
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @Test
    public void test1Xpath() {
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
        driver.findElement(By.xpath("//*[text() = 'Find your car now!']"));
        driver.findElement(By.xpath("//*[contains (text(), 'now!')]"));



        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//input[contains(@id, 'ci')]"));


        List<WebElement> ListInputs = driver.findElements(By.xpath("//input[@id]"));
        System.out.println("Lengh of List" + ListInputs.size());
        WebElement parentOfinput = driver.findElement(By.xpath("//input[@id='city']/.."));
        System.out.println("print atribute name " + parentOfinput.getAttribute("class"));


//        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
//        driver.findElements(By.xpath("//*[text() = 'Find your car now!']"));
//        driver.findElement(By.xpath("//input[@id='city']"));
//        List<WebElement> listInputs = driver.findElements(By.xpath("//input[@id]"));
//        System.out.println("length of list of inputs with id: " + listInputs.size());
//        WebElement parentOfInput = driver.findElement(By.xpath("//input[@id='city']/.."));
//
//        driver.findElement(By.xpath("//input[@id='city']"));
//        driver.findElement(By.xpath("//div[@class='input-container']//input[@id='city']"));
//        driver.findElement(By.xpath("//input[contains(@id,'ci')]"));
//        driver.findElement(By.xpath("//input[contains(@id,'ci') or contains(@id,'da')]"));
//        driver.findElement(By.xpath("//input[contains(@id,'ci') and @type='text']"));

    }


    @AfterClass
    public void postCondition() {
        driver.quit();
    }


}
