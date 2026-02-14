package structural.proxy;

import java.io.Serializable;

public class Player implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int level;
    private int deaths;
    private  int kills;
    public Player(String name, int level, int deaths, int kills) {
        this.name = name;
        this.level = level;
        this.deaths = deaths;
        this.kills = kills;
    }
}
