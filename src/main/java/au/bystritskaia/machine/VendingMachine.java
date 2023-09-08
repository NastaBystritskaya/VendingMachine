package au.bystritskaia.machine;

import au.bystritskaia.products.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * Торговый автомат
 */
public class VendingMachine implements IVendingMachine {

    private DisplayMenu display = new DisplayMenu();
    private CoinCollector collector = new CoinCollector();
    private CoinDisperser disperser = new CoinDisperser();

    @Override
    public DisplayMenu getDisplay() {
        return this.display;
    }

    @Override
    public CoinCollector getCollector() {
        return this.collector;
    }

    @Override
    public CoinDisperser getDisperser() {
        return this.disperser;
    }
}
