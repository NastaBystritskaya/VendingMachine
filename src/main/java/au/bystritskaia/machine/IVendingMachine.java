package au.bystritskaia.machine;

public interface IVendingMachine {
    DisplayMenu getDisplay();
    CoinCollector getCollector();

    CoinDisperser getDisperser();
}
