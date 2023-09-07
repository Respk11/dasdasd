import java.util.Optional;
import java.util.function.BiFunction;

@FunctionalInterface
interface OptionalBinaryOperation<T> extends BiFunction<T, T, Optional<T>> {

    Optional<T> apply(T t, T u);
}
