public class MainSum {
    public static void main(String[] args) {
        try {
            int number = 150;
            int sum = calculateSum(number);
            System.out.println("Сумма всех чисел от 1 до " + number + " равна " + sum);
        } catch (UncheckedException e) {
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
