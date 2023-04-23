public class Main {
    public static void main(String[] args) {
        String login = "%";
        String password = "11111111111";
        String confirmPassword = "11111111111%";

        try {
            CheckValidator.checkValidate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();  // здесы была ошибка у меня. Было exception.getStackTrace();
        }finally {
            System.out.println("Авторизация завершена!");
        }
        System.out.println("Привет User!");
    }
}