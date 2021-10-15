import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionLevelTest {
    PermissionManager permissionManager;
    @BeforeEach
    void setUp(){
        permissionManager = new PermissionManager();
    }

    @Test
    @DisplayName("Role name should be returned")
    void getCurrentLevelTest(){
        System.out.println("Get Test");
        assertEquals("User", permissionManager.getmCurrentLevel());
    }

    @Test
    @DisplayName("Role name should be set and updated")
    void setCurrentLevelTest(){
        System.out.println("Set Test");
        permissionManager.setPermissionLevel(PermissionLevel.ADMIN);
        assertEquals("Admin", permissionManager.getmCurrentLevel());
    }

    @Test
    @DisplayName("Role name should be equal to developer")
    void setDeveloperName(){
        permissionManager.setPermissionLevel(PermissionLevel.DEVELOPER);
        assertEquals("Developer", permissionManager.getmCurrentLevel());
    }
}