import seminars.third.hw.MainHW;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberInIntervalTest {

    @Test
    public void testNumberInInterval() {
        assertTrue(MainHW.numberInInterval(50)); // Здесь 50 входит в интервал (25;100)
    }

    @Test
    public void testNumberBelowInterval() {
        assertFalse(MainHW.numberInInterval(10)); // Здесь 10 не входит в интервал (25;100)
    }

    @Test
    public void testNumberAboveInterval() {
        assertFalse(MainHW.numberInInterval(150)); // Здесь 150 не входит в интервал (25;100)
    }
}
