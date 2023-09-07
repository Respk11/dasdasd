import java.util.Optional;
import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    static BinaryOperator<Integer> plus = (x, y) -> x + y;
    static BinaryOperator<Integer> minus = (x, y) -> x - y;
    static BinaryOperator<Integer> multiply = (x, y) -> x * y;
    static OptionalBinaryOperation<Integer>  devide = (x, y) -> {
        if (y == 0) {
            System.out.println("делить на ноль нельзя ничего не возвращаем");
            return Optional.empty();
        } else {
            int result = x / y;

            return Optional.of(result);
        }
    };
    static UnaryOperator<Integer> pow = x -> x * x;
    static UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    static Predicate<Integer> isPositive = x -> x > 0;
    static Consumer<Integer> println = System.out::println;
}
