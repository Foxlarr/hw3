import org.junit.jupiter.api.Test;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        assertTrue(MainHW.evenOddNumber(4)); // Здесь 4 - четное число
    }

    @Test
    public void testOddNumber() {
        assertFalse(MainHW.evenOddNumber(7)); // Здесь 7 - нечетное число
    }

    @Test
    public void testZero() {
        assertTrue(MainHW.evenOddNumber(0)); // Здесь 0 - четное число
    }
}
