package Calulator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Java6Assertions.assertThat;
@RunWith(JUnitParamsRunner.class)
class ParamterisedCalculatorTest {
 Calculator calculator;
    @Before
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    @Parameters({"1d,2d","6.3,3.1"})
    public void add(double valueA,double valueB) {
        assertThat(calculator.add(valueA,valueB)).isEqualTo(valueA+valueB);
    }

    @Test
    void substract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void root() {
    }
}