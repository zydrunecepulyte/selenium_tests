import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

class AutomateEverything {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/automation-practice-form/");
        driver.executeScript("scroll(0, 500);");
        driver.findElement(By.name("firstname")).sendKeys("Testas");
        driver.findElement(By.name("lastname")).sendKeys("Testiniauskas");
        driver.executeScript("scroll(0, 500);");
        driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("exp-4")).click();
        driver.executeScript("scroll(0, 500);");
        driver.findElement(By.id("datepicker")).sendKeys("2018-08-06");
        driver.findElementById("profession-0").click();
        driver.findElementById("profession-1").click();
        driver.executeScript("scroll(0, 800);");
        driver.findElement(By.id("tool-2")).click();
        driver.executeScript("scroll(0, 1000);");
        new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Australia");
        new Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("Switch Commands");

        WebElement element;
        element = driver.findElementByName("photo");
        element.sendKeys("C:\\Users\\Zydrune.Cepulyte\\Desktop\\cirkle.jpg");

    driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}