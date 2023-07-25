package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
}
