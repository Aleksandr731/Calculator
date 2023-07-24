package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }
    public String divide(double num1, double num2) throws ArithmeticException {
        double result = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            return "Ошибка, на 0 делить нельзя";
        } else return num1 + " / " + num2 + " = " + result;
    }
}
