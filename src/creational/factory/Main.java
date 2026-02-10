package creational.factory;

public class Main {
    void main() {
        Coin silverCoin = CoinFactory.getCoin(CoinType.SILVER);
        Coin goldCoin = CoinFactory.getCoin(CoinType.GOLD);

        System.out.println(silverCoin.getDescription());
        System.out.println(goldCoin.getDescription());
    }
}
