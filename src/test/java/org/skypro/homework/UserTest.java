package org.skypro.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user1;
    private User user2;

    @BeforeEach
    void setUp() {
        user1 = new User("Maria", "zayka@yandex.ru");
        user2 = new User();
    }

    @Test
    void createUserWithTransferOfTwoParametersToIt() {
        Assertions.assertTrue(user1.getLogin() != null && user1.getEmail() != null);
    }

    @Test
    void createUserWithOutTransferParametersToIt() {
        Assertions.assertTrue(user2.getLogin() == null && user2.getEmail() == null);
    }

    @Test
    void testTransferCorrectEmail() {
        Assertions.assertTrue(user1.getEmail().contains("@") && user1.getEmail().contains("."));
    }

    @Test
    void testEqualsOrNotLoginAndEmail() {
        Assertions.assertNotEquals(user1.getLogin(), user1.getEmail());
    }
}