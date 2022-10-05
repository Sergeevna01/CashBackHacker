package ru.netology.cashbackhacker;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {
    CashBackHackerService service = new CashBackHackerService();

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 2200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}