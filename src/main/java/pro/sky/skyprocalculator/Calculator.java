package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(double num1, double num2) {
        double result = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            return "Ошибка, делить на ноль нельзя";
        } else return num1 + " / " + num2 + " = " + result;
    }
}
