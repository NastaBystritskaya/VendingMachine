package au.bystritskaia.machine;

public class CoinDisperser {

    public int dropCoins(int productPrise, int credit) {
        return credit - productPrise;
    }
}
