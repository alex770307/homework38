import java.io.*;
import java.util.List;
import java.util.stream.Stream;

/**
 * Класс MainSum содержит методы для вычисления суммы чисел и основной метод main для выполнения программы.
 * <p>
 * В методе main происходит чтение файла, вычисление суммы чисел от 1 до указанного числа и вывод результата.
 * Метод calculateSum выполняет подсчет суммы чисел от 1 до указанного числа и проверяет, не превышает ли сумма заданное значение.
 * <p>
 * @author alex
 */
public class MainSum {

    /**
     * Основной метод программы для вычисления суммы чисел и вывода результата.
     */
    public static void main(String[] args) {

        File file = new File("Text.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            List<String> list = bufferedReader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .toList();

                int number = Integer.parseInt(list.get(0));
                int sum = calculateSum(number);
                System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    /**
     * Метод для вычисления суммы чисел от 1 до указанного числа.
     * При превышении суммы значения 10_000 генерируется неотслеживаемое исключение.
     *
     * @param number число, до которого нужно вычислить сумму
     * @return сумма чисел от 1 до number
     */
    public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum > 10_000) {
            throw new UncheckedException("Сумма превышает 10_000: " + sum);
        }
        return sum;
    }
}
