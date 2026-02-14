package structural.proxy;

import java.io.*;

public class GameImplement implements Game{
    private Player player;

    public GameImplement(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public void play() {
        System.out.println("Playing game with player: " + player);
    }

    @Override
    public void save() {
        System.out.println("Saving game for player: " + player);
    }

    private void writeObject(String saveFile) throws IOException {
        FileOutputStream file = new FileOutputStream(saveFile);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(getPlayer());
        out.flush();
        out.close();
        file.flush();
        file.close();
    }

    private void readObject(String name) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        ois.close();
        fis.close();
        if (o instanceof Player) {
            player = (Player) o;
        }
    }
}
