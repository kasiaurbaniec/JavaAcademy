package Calulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    public static Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        //When
        double result = calculator.add(6.3, 3.1);
        //Then
        assertThat(result)
                .as("result should be equal to 9.4")
                .isEqualTo(9.6);
    }


    @Test
    void substract() {
        //When
        double result = calculator.substract(6.3, 3.1);
        //Then
        assertThat(result).isEqualTo(3.2);
    }

    @Test
    void multiply() {
        //When
        double result = calculator.multiply(6.3, 3.1);
        //Then
        assertEquals(result,19.53);
        assertThat(result).isEqualTo(19.53);
    }

    @Test
    void divide() {
        //When
        double result = calculator.divide(6.2, 3.1);
        //Then
        assertThat(result).isEqualTo(2.0);
    }

    @Test
    void root() {
        //When
        double result = calculator.root(144.0);
        //Then
        assertThat(result).isEqualTo(12.0);
    }
}