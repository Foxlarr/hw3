import seminars.third.hw.MainHW;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        MainHW mainHW = new MainHW();
        assertTrue(mainHW.evenOddNumber(4));  // Положительное четное число
        assertTrue(mainHW.evenOddNumber(0));  // Ноль считается четным
        assertTrue(mainHW.evenOddNumber(-4)); // Отрицательное четное число

    }

    @Test
    public void testOddNumber() {
        MainHW mainHW = new MainHW();
        assertFalse(mainHW.evenOddNumber(7));   // Положительное нечетное число
        assertFalse(mainHW.evenOddNumber(-7));  // Отрицательное нечетное число

    }
}

