package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class Controller {
    private final Calculator calculator;

    public Controller(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String hello() {
        return HelloService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculator.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculator.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculator.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        return calculator.divide(num1, num2);
    }
}

