import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainNumberComparator {

    public static void main(String[] args) {

        File file = new File("Text.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();
            String[] list = line.split(" ");
            int firstNumber = Integer.parseInt(list[0]);
            int secondNumber = Integer.parseInt(list[1]);

            compareNumbers(firstNumber, secondNumber);
        } catch (CheckedException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void compareNumbers(int firstNumber, int secondNumber) throws CheckedException {
        if (firstNumber < secondNumber) {
            throw new CheckedException("Второе число больше первого: " + firstNumber + " < " + secondNumber);
        }
        System.out.println("Первое число больше второго: " + firstNumber + " > " + secondNumber);
    }
}
