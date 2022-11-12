package co.com.choucair.certification.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target CITY = Target.the("Field for the user to enter their city")
            .located(By.id("city"));
    public static final Target ZIP_CODE = Target.the("Field for the user to enter their zip code")
            .located(By.id("zip"));
    public static final Target CONTAINER_COUNTRY = Target.the("Container Countries")
            //.located(By.name("countryId"));
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("Field for the user to enter their Country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_DEVICES = Target.the("Button to go to device session")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
