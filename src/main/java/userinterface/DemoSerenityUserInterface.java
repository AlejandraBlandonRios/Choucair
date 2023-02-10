package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://serenity.is/demo/")
public class DemoSerenityUserInterface extends PageObject{
    public static final Target SIGN_IN_BUTTON = Target.the("SigIn button").
            located(By.id("LoginPanel0_LoginButton"));
    public static final Target STARTSHARP_BUTTON = Target.the("StartSharp button").
            located(By.xpath("//*[@title='StartSharp']"));
    public static final Target OPEN_ORDERS_BUTTON = Target.the("More info button ").
            located(By.xpath("//*[@href='/Northwind/Order?shippingState=0']"));
    public static final Target NEW_ORDER_BUTTON = Target.the("New order button ").
            located(By.xpath("//*[contains(text(), ' Nuevo Order')]"));
    public static final Target CUSTOMER_FIELD = Target.the("Customer field").
            located(By.xpath("/html[1]/body[1]/main[1]/section[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]"));
    public static final Target CUSTOMER_INPUT = Target.the("Customer input").
            located(By.xpath("/html[1]/body[1]/div[6]/div[1]/input[1]"));
    public static final Target ORDER_DATE_FIELD = Target.the("Order date field").
            located(By.xpath("//body[1]/main[1]/section[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]"));
    public static final Target SAVE_BUTTON = Target.the("Save button").
            located(By.xpath("//*[contains(text(), ' Guardar')]"));
    public static final Target DASHBOARD_MENU = Target.the("Dashboard menu").
            located(By.xpath("//span[contains(text(),'Dashboard')]"));
    public static final Target NUMBER_ORDERS_MESSAGE = Target.the("Number orders message").
            located(By.xpath("//*[@id='s-DashboardPage']/main/section/div[1]/div[1]/div/div[1]/h3"));
    public static final Target FIRST_ORDER_ITEM = Target.the("First order item").
            located(By.xpath("//*[@id='GridDiv']/div[3]/div[5]/div/div[1]/div[1]/a"));
    public static final Target SHIPPING_TAB = Target.the("Shipping tab").
            located(By.xpath("//a[contains(text(),'Shipping')]"));
    public static final Target SHIPPED_DATE_FIELD = Target.the("Shipped date field").
            located(By.xpath("//input[@id='Serenity_Demo_Northwind_OrderDialog15_ShippedDate']"));
}
