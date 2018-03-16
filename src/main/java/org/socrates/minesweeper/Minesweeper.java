package org.socrates.minesweeper;

public class Minesweeper {

    private final int width;
    private final int height;
    private final int numberOfBombs;
    private int recognizedClicks;

    Minesweeper(int width, int height, int numberOfBombs) {
        this.width = width;
        this.height = height;
        this.numberOfBombs = numberOfBombs;
    }

    public void leftClick(int x, int y) {
        recognizedClicks++;
    }

    public int recognisedClicks() {
        return recognizedClicks;
    }

    public int difficulty() {
        return 100 / (width*height) * numberOfBombs;
    }
}
