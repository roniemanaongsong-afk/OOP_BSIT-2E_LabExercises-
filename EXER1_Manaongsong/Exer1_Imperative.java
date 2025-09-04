public class Exer1_Imperative {
    public static void main(String[] args) {
        // Calculate sum of even numbers in imperative style
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        
        System.out.println("Sum of even numbers (Imperative): " + sum);
    }
}
