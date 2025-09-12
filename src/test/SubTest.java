import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubTest {

    @Test
    void testSub() {
        Sub sub = new Sub();
        int result = sub.sub(5, 3);
        assertEquals(2, result);
    }
}
