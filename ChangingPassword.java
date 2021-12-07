package HomeWork3.Diary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChangingPassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru/user/login");
        Cookie cookie = new Cookie("_identity_", "942363f2af66fb18b16d1523bd16e4d65f6fe45ab802502f391aa25d0e5901f8a%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3560473%2C%224UsyJBOePYDGL3aHFfdwGU9VkF0eg4eM%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        driver.findElement(By.id("optionsLink")).click();
        driver.findElement(By.linkText("Изменить пароль")).click();
        driver.findElement(By.id("changepassform-password")).sendKeys("qwe1234567");
        driver.findElement(By.id("new_pass")).sendKeys("qwe12345");
        driver.findElement(By.id("changepassform-repeatpassword")).sendKeys("qwe12345");
        driver.findElement(By.id("form_change_pass_submit")).click();
        Thread.sleep(10000);
        driver.quit();

    }
}
