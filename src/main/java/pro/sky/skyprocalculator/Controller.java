package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.DigestException;

@RequestMapping("/calculator")
@RestController
public class Controller {
    private final CalculatorServiceImpl calculatorServiceImpl;

    public Controller(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping(path = "/plus")
    public long plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public long minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public long multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        return calculatorServiceImpl.divide(num1, num2);
    }
}

