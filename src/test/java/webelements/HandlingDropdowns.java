package webelements;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HandlingDropdowns extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void webElementTest(){
        System.out.println("111111");
        find(By.id("searchLanguage")).selectByVisibleText("Eesti");
        System.out.println("aqui llegue");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
