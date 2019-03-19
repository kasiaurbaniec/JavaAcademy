package Datebase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DatebaseTest {
    static Datebase datebase;

    @BeforeEach
    void setUp() {
        List<User> users = Arrays.asList(
                new User("misia", "1234"),
                new User("kicia", "9876"));
        datebase = new Datebase(users);
    }

    @Test
    void addUser() {
        //When
        int previousSize = datebase.findAll().size();
        User userNew = new User("nowy", "nowy159");
        datebase.addUser(userNew);
        //Then
        int sizeAfter=datebase.findAll().size();
        assertThat(sizeAfter).as("Should equals 3")
                .isEqualTo(3)
                .isEqualTo(previousSize+1);
        assertThat(datebase.findUser("nowy")).isEqualTo(userNew);
    }

    @Test
    void findAll() {
        //Then
        assertThat(datebase.findAll().size()).isEqualTo(2);
        assertThat(datebase.findAll().get(0).getLogin()).isEqualTo("kicia");
        assertThat(datebase.findAll().get(1).getLogin()).isEqualTo("misia");
    }

    @Test
    void removeUser() {
        //When
        int previousSize = datebase.findAll().size();
        datebase.removeUser("misia");
        //Then
        int sizeAfter=datebase.findAll().size();
        assertThat(sizeAfter).as("Should equals 1")
                .isEqualTo(1)
                .isEqualTo(previousSize-1);
    }

    @Test
    void findUser() {
        //Then
        assertThat(datebase.findUser("misia").getPassword()).isEqualTo("1234");
        assertThat(datebase.findUser("misia")).isNotNull();
    }
}