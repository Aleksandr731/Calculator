package pro.sky.skyprocalculator;
import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.exception.DivideException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public long plus(int num1, int num2) {
        return (long) num1 + num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long) num1 - num2;
    }

    @Override
    public long multiply(int num1, int num2) {
        return (long) num1 * num2;
    }

    @Override
    public double divide(double num1, double num2){
        if (num1 == 0 || num2 == 0) {
            throw new DivideException("Деление на 0 не допустимо");
        } else return (double) num1 / num2;
    }
}
