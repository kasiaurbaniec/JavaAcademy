package Airplane;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    static Airplane airplane;

    @BeforeAll
    public static void setUp() {
        airplane = new Airplane("airbus", 450000);
    }

    @Test
    void ascent() {
        //When
        airplane.ascent(600000);
        int result = airplane.getHeight();
        //Then
        assertThat(result).isEqualTo(1000000)
                .isLessThanOrEqualTo(1000000);
    }

    @Test
    void descent() {
        //When
        airplane.descent(600000);
        int result = airplane.getHeight();
        //Then
        assertThat(result).isEqualTo(0)
                .isGreaterThanOrEqualTo(0);
    }

    @Test
    void getName() {
        //When
        String result = airplane.getName();
        //Then
        assertThat(result).isEqualTo("airbus");

    }

    @Test
    void getHeight() {
        //When
        int result = airplane.getHeight();
        //Then
        assertThat(result)
        .as("Height %s's should be equal to 450000",airplane.getName())
        .isGreaterThanOrEqualTo(0)
        .isEqualTo(450000);

    }
}