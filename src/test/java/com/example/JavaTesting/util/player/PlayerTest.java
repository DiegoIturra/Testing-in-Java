package com.example.JavaTesting.util.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void losses_when_dice_is_too_low(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice , 3);

        assertFalse(player.play());
    }

    @Test
    public void win_when_dice_is_high(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);

        Player player = new Player(dice,3);
        assertTrue(player.play());
    }
}