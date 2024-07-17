public class MainNumberComparator {

    public static void main(String[] args) {
        try {
            int firstNumber = 10;
            int secondNumber = 20;
            compareNumbers(firstNumber, secondNumber);
        } catch (CheckedException e) {
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
