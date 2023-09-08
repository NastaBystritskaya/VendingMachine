package au.bystritskaia.machine;

public class CoinDisperser {
    private int productPrise;

    private int credit;

    public CoinDisperser(int productPrise, int credit) {
        this.productPrise = productPrise;
        this.credit = credit;
    }

    public int dropCoins() {
        return this.credit - this.productPrise;
    }
}
