import java.util.Optional;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
       Calculator calc = Calculator.instance.get();
       int a = Calculator.plus.apply(1, 2);
       int b = Calculator.minus.apply(1,1);
       Optional<Integer> c = Calculator.devide.apply(a, b);
       c.ifPresent(сv -> Calculator.println.accept(сv));
    }}