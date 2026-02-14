package structural.proxy;

import java.io.*;

public class GameProxy implements Game {
    private Game realGame;
    private String saveFile;

    public GameProxy(String saveFile) {
        this.saveFile = saveFile;
    }

    @Override
    public void play() {
        if (realGame == null) {
            Player player = loadPlayer();
            if (player == null) {
                // Default player if no save file
                player = new Player("DefaultPlayer", 1, 0, 0);
            }
            realGame = new GameImplement(player);
        }
        realGame.play();
    }

    @Override
    public void save() {
        if (realGame != null) {
            realGame.save();
            savePlayer();
        }
    }

    private void savePlayer() {
        try {
            FileOutputStream file = new FileOutputStream(saveFile);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(((GameImplement) realGame).getPlayer());
            out.flush();
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Player loadPlayer() {
        try {
            FileInputStream fis = new FileInputStream(saveFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ois.close();
            fis.close();
            if (o instanceof Player) {
                return (Player) o;
            }
        } catch (IOException | ClassNotFoundException e) {
            // File not found or error, return null
        }
        return null;
    }
}
