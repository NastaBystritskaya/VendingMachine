package au.bystritskaia.machine;

public class CoinCollector  {
    private int sum = 0;
    private int count = 0;
    public void putCount(int coin) {
        this.sum = this.sum + coin;
        this.count++;
    }
}
