import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .boxed()
                .map(i -> i % 3 == 0 ? (i % 5 == 0 ? "Fizzbuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(s -> System.out.println(s));
    }
}
