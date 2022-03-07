package testcases;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed (driver ="chrome")
    WebDriver driver;

    @Title("Executing Login test")
    @Test
    public void doLogin(){

        open();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Hello serenity");
        System.out.println(getWaitForTimeout());
        System.out.println(getImplicitWaitTimeout());
        WebElementFacade textBox = find(By.name("q"));
        textBox.typeAndEnter("Hello Selenium !!!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }





}
