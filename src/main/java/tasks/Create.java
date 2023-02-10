package tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Keys;
import static userinterface.DemoSerenityUserInterface.*;

public class Create implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGN_IN_BUTTON),
                Click.on(STARTSHARP_BUTTON));
        Serenity.setSessionVariable("Orders").to(Text.of(NUMBER_ORDERS_MESSAGE).viewedBy(actor).asString());
        actor.attemptsTo(Click.on(OPEN_ORDERS_BUTTON),
                Click.on(NEW_ORDER_BUTTON),
                Click.on(CUSTOMER_FIELD),
                Enter.theValue("Alfreds").into(CUSTOMER_INPUT),
                Enter.theValue(String.valueOf(Keys.ENTER)).into(CUSTOMER_INPUT),
                Enter.theValue("01/02/2023").into(ORDER_DATE_FIELD),
                Click.on(SAVE_BUTTON),
                Click.on(DASHBOARD_MENU));
    }
    public static Create anOrder() {
        return Tasks.instrumented(Create.class);
    }
}
