package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public double divide(double num1, double num2) throws ArithmeticException {
        String ArithmeticException;
        if (num1 == 0 || num2 == 0) {
        } throw new ArithmeticException("Деление на ноль");
        return num1 / num2;
    }
}
