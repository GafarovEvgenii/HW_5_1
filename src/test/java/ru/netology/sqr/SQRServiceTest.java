package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "firstTest, 100, 130, 2",
            "secondTest, 200, 300, 3"})
    void shouldCalculate(String test, int start, int finish, int expected) {
        SQRService service = new SQRService();

        long actual = service.calculateSquqres(start, finish);

        assertEquals(expected, actual);
    }

}