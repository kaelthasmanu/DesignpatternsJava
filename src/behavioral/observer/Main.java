package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Gandalf");
        Mage mage2 = new Mage("Merlin");
        Assasin assasin =new Assasin("Ezio");
        Guard guard = new Guard("Leonidas");
        guard.addObserver(mage1);
        guard.addObserver(mage2);
        guard.addObserver(assasin);

        // Trigger notification to observers
        guard.broadcastMessage("Enemy spotted!");
    }
}
