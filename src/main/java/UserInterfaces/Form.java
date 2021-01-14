package UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Form {
    public static final Target NEW_REGISTER = Target.the("Fild Register").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target NAME = Target.the("Fild Name").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Fild Last_name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Fild Email").located(By.id("email"));
    public static final Target MOUNT = Target.the("Fild Mount").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Fild Day").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Fild Year").located(By.id("birthYear"));
    public static final Target NEXT_CONTINUO = Target.the("Fild NextContinuo").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));



}
