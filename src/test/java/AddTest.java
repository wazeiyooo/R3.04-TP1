import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class AddTest {

    @Test
    void testAdd() {
        Add add = new Add();
        assertEquals(5, add.add(2, 3));
    }
}

