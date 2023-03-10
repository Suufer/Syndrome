package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithEmptyIncomes() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithCurrentIncomes() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxWhenFirstElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 4, 3, 2, 1};
        long expected = 5;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxWhenLastElementIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }
}