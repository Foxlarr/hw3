import seminars.third.hw.MainHW;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(4)); // Здесь 4 - четное число
    }

    @Test
    public void testOddNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(7)); // Здесь 7 - нечетное число
    }

    @Test
    public void testZero() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(0)); // Здесь 0 - четное число
    }
}

