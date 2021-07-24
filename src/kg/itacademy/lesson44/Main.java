package kg.itacademy.lesson44;

public class Main {
    public static void main(String[] args) {
        UserServic userServic = new UserServic();
        UserModel userModel = new UserModel();
        userModel.setPassword("123");
        userModel.setLogin("login1");
        userModel.setEmail("login1@mail.ru");
        try {
            userServic.register(userModel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        userServic.authorize(userModel.getLogin(), userModel.getPassword());
        userServic.authorize(userModel.getLogin(), "asdf");
    }
}
