package Datebase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
private static User user1;
private static User user2;
private static User user3;
    @BeforeEach
    void setUp() {
        user1=new User("siaksiak1","kasia1");
        user2=new User("siaksiak2","kasia2");
        user3=new User("siaksiak3","kasia3");
    }

    @Test
    void getLogin() {
    }

    @Test
    void setLogin() {
    }

    @Test
    void getPassword() {
    }

    @Test
    void setPassword() {
    }
}