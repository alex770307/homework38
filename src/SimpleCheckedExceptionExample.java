import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCheckedExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите число от 1 до 10 : ");

        try {
            int number = scanner.nextInt();
            if (number < 1 || number > 10) {
                System.out.println("Неверный выбор!");
            }else {
                System.out.println("Вы выбрали число: " + number);
            }
        }catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите числовое значение.");
        }
    }
}
