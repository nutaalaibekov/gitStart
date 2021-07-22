package kg.itacademy.lesson44;

public class Main {
    public static void main(String[] args) {
        UserServic userServic = new UserServic();
        UserModel userModel = new UserModel();
        userModel.setPassword("123");
        userModel.setLogin("login");
        userModel.setEmail("login@mail.ru");
        UserModel userModel2 = new UserModel();
        userModel2.setPassword("password");
        userModel2.setLogin("username");
        userModel2.setEmail("username@mail.ru");
        try {
            userServic.register(userModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            userServic.register(userModel2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        userServic.authorize(userModel.getLogin(), userModel.getPassword());
        userServic.authorize(userModel.getLogin(), "asdf");
    }
}
