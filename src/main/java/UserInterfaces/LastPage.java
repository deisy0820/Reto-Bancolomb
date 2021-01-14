package UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LastPage {
    public static final Target PASSWORD = Target.the("Fild Passbord").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Fild Confirm_Password").located(By.id("confirmPassword"));
    public static final Target ACCEPT = Target.the("Fild Accept").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_POLICY = Target.the("Fild Accept_Policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Fild Button").located(By.xpath("//*[@id=\"laddaBtn\"]/i"));


}
