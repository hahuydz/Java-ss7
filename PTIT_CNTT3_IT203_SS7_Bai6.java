import java.util.ArrayList;
import java.util.List;

public class PTIT_CNTT3_IT203_SS7_Bai6 {
    public static class User {

        private final int id;
        private String username;
        private String password;

        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Username: " + username;
        }
    }


    public static class UserManager {

        private static List<User> userList = new ArrayList<>();


        private static int nextId = 1;


        public static void addUser(String username, String password) {
            User newUser = new User(nextId++, username, password);
            userList.add(newUser);
            System.out.println("Đã thêm người dùng: " + username);
        }


        public static User findUser(String username) {
            for (User u : userList) {
                if (u.getUsername().equalsIgnoreCase(username)) {
                    return u;
                }
            }
            return null;
        }


        public static void getAllUsers() {
            System.out.println("\n--- DANH SÁCH NGƯỜI DÙNG ---");
            for (User u : userList) {
                System.out.println(u);
            }
        }
    }
}

