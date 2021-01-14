package UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class FormAddress {
    public static final Target CITY = Target.the("Fild City").located(By.id("city"));
    public static final Target CODE_POSTAL = Target.the("Fild Code").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Fild Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target NEXT_DEVICES = Target.the("Fild Next").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}



