package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public abstract class HelloService implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

}
