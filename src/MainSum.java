import java.io.*;

public class MainSum {
    public static void main(String[] args) {

        File file = new File("Text.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {


                String line = bufferedReader.readLine();
                String[] list = line.split(" ");
                int number = Integer.parseInt(list[0]);
                int sum = calculateSum(number);
                System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);

        } catch (UncheckedException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum > 10_000) {
            throw new UncheckedException("Сумма превышает 10,000: " + sum);
        }
        return sum;
    }
}
