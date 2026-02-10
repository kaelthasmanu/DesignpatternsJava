package creational.factory;

public class SilverCoin implements Coin {

    static final String DESCRIPTION = "This is a silver coin.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}