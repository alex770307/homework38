/**
 * Класс представляет неотслеживаемое исключение, которое является подклассом RuntimeException.
 *
 * @author alex
 */
public class UncheckedException extends RuntimeException{
    /**
     * Конструктор класса UncheckedException.
     * @param message сообщение об ошибке
     */
    public UncheckedException(String message) {
        super(message);
    }
}
