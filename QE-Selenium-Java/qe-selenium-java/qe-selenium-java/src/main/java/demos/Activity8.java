package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println(driver.getTitle());
        driver.findElement( By.xpath("//*[@id='stage']/div[1]/div[1]/div") );
        actions.click(driver.findElement(By.xpath("//*[@id='stage']/div[1]/div[1]/div"))).perform();
        actions.click(driver.findElement( By.xpath("//h1[text()='Cargo.toml']/parent::div"))).perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        actions.doubleClick(driver.findElement(By.xpath("//h1[text()='src']/parent::div") )).perform();
        actions.contextClick(driver.findElement(By.xpath("//h1[text()='target']/parent::div"))).perform();
        actions.click(driver.findElement( By.xpath("//*[@id='menu']/div/ul/li[1]"))).perform();
        System.out.println(driver.findElement(By.id("result")).getText());
        driver.quit();
    }
}

