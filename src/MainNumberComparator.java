import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Класс MainNumberComparator содержит методы для сравнения двух чисел и основной метод main для выполнения программы.
 * <p>
 * В методе main происходит чтение файла, сравнение двух чисел и вывод результата сравнения.
 * Метод compareNumbers осуществляет сравнение и генерирует проверяемое исключение при несоответствии условиям.
 * <p>
 * @author alex
 */
public class MainNumberComparator {

    /**
     * Основной метод программы для сравнения двух чисел и вывода результата.
     */
    public static void main(String[] args) {

        File file = new File("Text.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            List<String> list = bufferedReader.lines()
                    .flatMap(line -> Stream.of(line.split(" ")))
                    .toList();

            int firstNumber = Integer.parseInt(list.get(0));
            int secondNumber = Integer.parseInt(list.get(1));

            compareNumbers(firstNumber, secondNumber);
        } catch (CheckedException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для сравнения двух чисел. Генерирует проверяемое исключение при несоответствии условиям.
     *
     * @param firstNumber первое число для сравнения
     * @param secondNumber второе число для сравнения
     * @throws CheckedException если второе число больше первого
     */
    public static void compareNumbers(int firstNumber, int secondNumber) throws CheckedException {
        if (firstNumber < secondNumber) {
            throw new CheckedException("Второе число больше первого: " + firstNumber + " < " + secondNumber);
        }
        System.out.println("Первое число больше второго: " + firstNumber + " > " + secondNumber);
    }
}
