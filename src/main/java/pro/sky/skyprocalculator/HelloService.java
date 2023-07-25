package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public interface HelloService {


    static String hello() {
        return "Добро пожаловать в калькулятор";
    }

}
