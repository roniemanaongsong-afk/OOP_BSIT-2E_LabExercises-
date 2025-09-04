import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exer1_Functional {
    public static void main(String[] args) {
        // Calculate sum of even numbers using functional programming
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        
        int sum = numbers.stream()
                .filter(isEven)
                .reduce(0, Integer::sum);
        
        System.out.println("Sum of even numbers (Functional): " + sum);
    }
}
