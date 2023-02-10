package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.DemoSerenityUserInterface.NUMBER_ORDERS_MESSAGE;

public class NumberOf implements Question<Boolean> {

    public static NumberOf actualOrdersIncreasedByOne() {
        return new NumberOf();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int orders = Integer.parseInt(Serenity.sessionVariableCalled("Orders").toString())+1;
        return Text.of(NUMBER_ORDERS_MESSAGE).viewedBy(actor).asString().equals(Integer.toString(orders));
    }
}
