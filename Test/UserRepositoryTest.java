import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.tdd.User;
import seminars.third.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private UserRepository userRepository;

    @BeforeEach
    public void setUp() {
        userRepository = new UserRepository();
    }

    @Test
    public void testLogoutAllNonAdminUsers() {
        User adminUser = new User("admin", "admin123", true);
        User regularUser1 = new User("user1", "password1", false);
        User regularUser2 = new User("user2", "password2", false);

        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        userRepository.logoutAllNonAdminUsers();

        assertFalse(userRepository.findByName("user1")); // Пользователь user1 должен быть разлогинен
        assertFalse(userRepository.findByName("user2")); // Пользователь user2 должен быть разлогинен
        assertTrue(userRepository.findByName("admin")); // Администратор admin не должен быть разлогинен
    }
}
