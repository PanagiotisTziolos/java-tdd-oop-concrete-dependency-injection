package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public PowerSupply psu;
    public ArrayList<Game> installedGames = new ArrayList<>();

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> games) {
        this.psu = psu;
        this.installedGames = games;
    }

    public void turnOn() {
        psu.turnOn();
    }

    public void installGame(String gameTitle) {
        Game game = new Game(gameTitle);
        this.installedGames.add(game);
    }

    public String playGame(String gameTitle) {
        for (Game g : this.installedGames) {
            if (g.name.equals(gameTitle)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
