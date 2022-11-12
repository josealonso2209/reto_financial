package co.com.choucair.certification.challenge.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PersonalPage {

    public static final Target FIRSTNAME = Target.the("Field for the user to enter their name")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("Field for the user to enter their last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Field for the user to enter their email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("Field for the user to enter their month of birth")
            .located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Field for the user to enter their day of birth")
            .located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Field for the user to enter their year of birth")
            .located(By.id("birthYear"));
    public static final Target BUTTON_ADDRESS = Target.the("Field for the user to enter their address")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
