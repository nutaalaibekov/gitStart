package kg.itacademy.lesson44;

public class UserServic {
    private UsersDao usersDao = new UsersDao();

    public boolean register(UserModel userModel) throws Exception {
        if (userModel.getLogin() == null || userModel.getLogin().isEmpty()) {
            throw new IllegalArgumentException("Неверные параметры");
        }
        // TODO: add more validation
        UserModel userDb = usersDao.getByUsername(userModel.getLogin());
        if (userDb != null) {
            throw new Exception("Такой у нас уже есть");
        }

        userModel = usersDao.createUser(userModel);

        if (userModel != null) {
            return true;
        }
        return false;
    }

    public boolean authorize(String login, String password) {
        boolean result = false;
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }
        UserModel userDb = usersDao.getByUsername(login);
        if (userDb != null) {
            UserLog userLog = new UserLog();
            userLog.setUserId(userDb.getId());

            result = userDb.getPassword().equals(password);
            userLog.setSuccess(result);
            usersDao.writeLog(userLog);
            return result;
        }
        return false;
    }

}
