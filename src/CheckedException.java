/**
 * Класс представляет проверяемое исключение, которое является подклассом Exception.
 *
 * @author alex
 */
public class CheckedException extends Exception {
    /**
     * Конструктор класса CheckedException.
     * @param message сообщение об ошибке
     */
    public CheckedException(String message) {
        super(message);
    }
}
