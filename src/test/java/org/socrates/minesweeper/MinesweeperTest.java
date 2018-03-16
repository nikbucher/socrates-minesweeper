package org.socrates.minesweeper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MinesweeperTest {
    @Test
    public void should_get_one_click_on_1x1_game() {
        // given
        final Minesweeper sut = new Minesweeper(1, 1);

        // when
        sut.leftclick(0, 0);

        // then
        assertThat(sut.recognisedClicks(), is(1));
    }

    @Test
    public void should_get_2_click_on_2x2_game() {
        // given
        final Minesweeper sut = new Minesweeper(2, 2);

        // when
        sut.leftclick(0, 0);
        sut.leftclick(1, 1);

        // then
        assertThat(sut.recognisedClicks(), is(2));
    }


}
