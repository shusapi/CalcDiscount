import com.sun.tools.attach.AgentInitializationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
    Discount disc = new Discount();

    @org.junit.jupiter.api.Test
    void setDiscount() {
        assertEquals(700,disc.setDiscount(1000,0.3));
        //assertEquals(705,disc.setDiscount(1000,0.35),5,"値引率が正しくありません");
        assertEquals("OK",disc.calcRate(0.5,0.3),"値引率が正しくありません");
        assertEquals("NG",disc.calcRate(0.1,0.3),"値引率が正しくありません");
    }

    @Test
    void sexCheck() {
        assertEquals(0.2, disc.sexCheck("f"),0.0);
        assertEquals(0.1,disc.sexCheck("m"),0.0);
    }

    @Test
    void testPriceCheck() {
        assertTrue(disc.priceCheck(50000));
        assertFalse(disc.priceCheck(10000));
    }

    @Test
    void testAgeCheck() {
        assertEquals(3000,disc.ageCheck(18));
        assertEquals(1000,disc.ageCheck(20));
    }
}