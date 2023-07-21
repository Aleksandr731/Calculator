package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
}
