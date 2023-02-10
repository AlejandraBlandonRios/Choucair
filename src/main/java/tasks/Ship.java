package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.DemoSerenityUserInterface.*;

public class Ship implements Task {
    public static Ship anOrder() {
        return Tasks.instrumented(Ship.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPEN_ORDERS_BUTTON),
                Click.on(FIRST_ORDER_ITEM),
                Click.on(SHIPPING_TAB),
                Enter.theValue("09/02/2023").into(SHIPPED_DATE_FIELD),
                Click.on(SAVE_BUTTON),
                Click.on(DASHBOARD_MENU));
    }
}
