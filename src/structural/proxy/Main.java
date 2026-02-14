package structural.proxy;

public class Main {
    public static void main(String[] args) {
        // Using the proxy to play and save the game
        Game game = new GameProxy("save.dat");

        // First play - should load or create default player
        game.play();

        // Save the game
        game.save();

        // Second play - should load from file
        game.play();
    }
}
