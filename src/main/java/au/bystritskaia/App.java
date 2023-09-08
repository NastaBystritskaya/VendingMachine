package au.bystritskaia;

import au.bystritskaia.machine.IVendingMachine;
import au.bystritskaia.machine.VendingMachine;
import au.bystritskaia.products.BottleOfWater;
import au.bystritskaia.products.HotDrink;
import au.bystritskaia.products.Product;
import au.bystritskaia.view.Root;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    private static List<Product> products = List.of(
            new BottleOfWater(5, 26, "Аква Минирале"),
            new BottleOfWater(3, 30, "Шишкин лес"),
            new HotDrink(2, 100, "Кофе", 60),
            new HotDrink(2, 80, "Чай", 65)

    );
    public static void main( String[] args )
    {
        IVendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getDisplay().addProducts(products);

        Root root = new Root(vendingMachine);
    }
}
