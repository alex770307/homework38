import java.util.Scanner;

public class SimpleUncheckedExceptionExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое число : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Случай выпадения непроверяемого исключения.");
            throw new RuntimeException();
        }

    }
}
