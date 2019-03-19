package Datebase;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Datebase {

    private Map<String, User> users;

    public Datebase() {
        users = new HashMap<String, User>();
    }

    public Datebase(List<User> userList) {
        users = userList.stream().collect(Collectors.toMap(User::getLogin,Function.identity()));
    }

    public void addUser(User user) {
        if (users.keySet().contains(user.getLogin())) {
            throw new UserExistsException("User already exists.");
        }
        users.put(user.getLogin(), user);
    }

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public void removeUser(String login) {
        users.remove(login);
    }

    public User findUser(String login) {
        return users.get(login);
    }
}
