package UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormDevices {

    public static final Target COMPUTER = Target.the("Fild Computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION = Target.the("Fild Version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target LANGUAGE = Target.the("Fild language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target MOVIL = Target.the("Fild Movil").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MODEL = Target.the("Fild Model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SYSTEM = Target.the("Fild System").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target NEXT_LAST_PAGE = Target.the("Fild Next_last_page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));





}
