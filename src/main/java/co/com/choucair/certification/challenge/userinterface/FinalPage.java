package co.com.choucair.certification.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {
    public static final Target PASSWORD = Target.the("Field for the user to enter their password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Field for the user to enter confirm_password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY = Target.the("Field for the user to accept that he was informed.")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_READ_1 = Target.the("Field for the user to accept that they read the readme_01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_READ_2 = Target.the("Field for the user to accept that they read the readme_02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Field for the user to accept that they read the readme_02")
            .located(By.id("laddaBtn"));
}
