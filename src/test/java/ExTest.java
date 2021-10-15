import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExTest {
    @Test
    void divisionValidation() {
        Ex calc = new Ex();
        Assertions.assertEquals(-1e9, calc.division(10, 0));

    }
}
