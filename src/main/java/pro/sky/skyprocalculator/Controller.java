package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class Controller {
    private final CalculatorServiceImpl calculatorServiceImpl;
    private final HelloServiceImpl helloServiceImpl;

    public Controller(CalculatorServiceImpl calculatorServiceImpl, HelloServiceImpl helloServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
        this.helloServiceImpl = helloServiceImpl;
    }

    @GetMapping
    public String hello() {
        return helloServiceImpl.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServiceImpl.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return calculatorServiceImpl.divide(num1, num2);
    }
}

