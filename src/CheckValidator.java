import java.util.regex.Pattern;

public class CheckValidator {
    public static void checkValidate(String login, String password, String confirmPassword) {
        if (!Pattern.matches("[a-zA-Z0-9_]{1,20}", login)) {
            throw new WrongLoginException("Неверный формат ввода логина !!!");
        }
        if (!Pattern.matches("[a-zA-Z0-9_]{1,19}", password)) {
            throw new WrongPasswordException("Неверный формат ввода пароля !!!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!!!");
        }
    }
}

