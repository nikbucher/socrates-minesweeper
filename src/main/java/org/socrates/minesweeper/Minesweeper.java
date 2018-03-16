package org.socrates.minesweeper;

public class Minesweeper {

    private int reconizedClicks;

    public Minesweeper(int width, int height) {
    }

    public void leftclick(int x, int y) {
        reconizedClicks++;
    }

    public int recognisedClicks() {
        return reconizedClicks;
    }
}
