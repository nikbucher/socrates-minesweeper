package org.socrates.minesweeper;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Minesweeper {

    private final int width;
    private final int height;
    private final int numberOfBombs;
    private final Set<Click> recognizedClicks = new HashSet<>();

    Minesweeper(int width, int height, int numberOfBombs) {
        this.width = width;
        this.height = height;
        this.numberOfBombs = numberOfBombs;
    }

    public void leftClick(int x, int y) {
        recognizedClicks.add(new Click(x, y));
    }

    public int recognisedClicks() {
        return recognizedClicks.size();
    }

    public int difficulty() {
        return 100 / (width * height) * numberOfBombs;
    }

    class Click {
        private final int x;
        private final int y;

        Click(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Click click = (Click) o;
            return x == click.x &&
                    y == click.y;
        }

        @Override
        public int hashCode() {

            return Objects.hash(x, y);
        }
    }
}
