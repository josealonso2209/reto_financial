package co.com.choucair.certification.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class HomePage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[contains(text(),'Join Today')]//ancestor::ul[@class='nav navbar-nav']"));

}
