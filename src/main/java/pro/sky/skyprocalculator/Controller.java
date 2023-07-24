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
    public String plus(@RequestParam int num1,@RequestParam int num2) {
        return calculator.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1,@RequestParam int num2) {
        return calculator.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1,@RequestParam int num2) {
        return calculator.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam double num1,@RequestParam double num2) {
        return calculator.divide(num1, num2);
    }
}
