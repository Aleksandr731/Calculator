package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final HelloService helloService;
    private final Calculator calculator;

    public Controller(HelloService helloService, Calculator calculator) {
        this.helloService = helloService;
        this.calculator = calculator;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public int plus(@RequestParam() int num1, int num2) {
        return calculator.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public int minus(@RequestParam() int num1, int num2) {
        return calculator.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public int multiply(@RequestParam() int num1, int num2) {
        return calculator.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public double divide(@RequestParam() double num1, double num2) {
        return calculator.divide(num1, num2);
    }
}
