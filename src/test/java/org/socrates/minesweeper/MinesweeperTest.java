package org.socrates.minesweeper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinesweeperTest {
    @Test
    public void should_get_one_click_on_1x1_game() {
        final Minesweeper sut = new Minesweeper(1, 1, 1);
        sut.leftClick(0, 0);

        assertThat(sut.recognisedClicks(), is(1));
    }

    @Test
    public void should_get_2_click_on_2x2_game() {
        final Minesweeper sut = new Minesweeper(2, 2, 1);

        sut.leftClick(0, 0);
        sut.leftClick(1, 1);

        assertThat(sut.recognisedClicks(), is(2));
    }

    @Test
    public void should_get_difficulty_of_100_for_one_bomb_on_1x1_game() {
        final Minesweeper sut = new Minesweeper(1, 1, 1);

        assertThat(sut.difficulty(), is(100));
    }

    @Test
    public void should_get_difficulty_of_0_for_zero_bombs_on_1x1_game() {
        final Minesweeper sut = new Minesweeper(1, 1, 0);

        assertThat(sut.difficulty(), is(0));
    }

    @Test
    public void should_get_difficulty_of_25_for_one_bomb_on_2x2_game() {
        final Minesweeper sut = new Minesweeper(2, 2, 1);

        assertThat(sut.difficulty(), is(25));
    }

    @Test
    public void should_count_click_on_same_field_only_once() {
        final Minesweeper sut = new Minesweeper(1, 1, 1);

        sut.leftClick(0, 0);
        sut.leftClick(0, 0);

        assertThat(sut.recognisedClicks(), is(1));
    }


}
