package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.DemoSerenityUserInterface.NUMBER_ORDERS_MESSAGE;

public class TheNumberOf implements Question {
    public static TheNumberOf actualOrdersWithoutChanges() {
        return new TheNumberOf();
    }

    @Override
    public Object answeredBy(Actor actor) {
        int orders = Integer.parseInt(Serenity.sessionVariableCalled("Orders").toString());
        return Text.of(NUMBER_ORDERS_MESSAGE).viewedBy(actor).asString().equals(Integer.toString(orders));
    }
}
