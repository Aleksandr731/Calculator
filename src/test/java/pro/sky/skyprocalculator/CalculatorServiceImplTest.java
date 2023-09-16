package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculator.exception.DivideException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 1;
        int num2 = 2;

        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        int num1 = 5;
        int num2 = -6;

        long result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }


    @Test
    void minus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 1;
        int num2 = 2;

        long result = calculatorService.minus(num1,num2);
        assertEquals(num1 - num2,result);
    }
    @Test
    void minus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        int num1 = 5;
        int num2 = -6;

        long result = calculatorService.minus(num1,num2);
        assertEquals(num1 - num2,result);
    }


    @Test
    void multiply_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 1;
        int num2 = 2;

        long result = calculatorService.multiply(num1,num2);
        assertEquals(num1 * num2,result);
    }

    @Test
    void multiply_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        int num1 = 5;
        int num2 = -6;

        long result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2,result);
    }

    @Test
    void divide_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        int num1 = 5;
        int num2 = 2;

        double result = calculatorService.divide(num1 , num2);
        assertEquals((double)num1/num2, result);
        }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        int num1 = 5;
        int num2 = -2;

        double result = calculatorService.divide(num1, num2);
        assertEquals((double) num1/num2, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenNum2Is0() {
        int num1 = 0;
        int num2 = 1;

        DivideException result = assertThrows(DivideException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Деление на 0 не допустимо", result.getMessage());
    }
}

