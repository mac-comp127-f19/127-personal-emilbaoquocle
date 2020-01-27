package Hypotenuse;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOddEven {
    @Test
    public void testOddorEven() {
        assertEquals(true, OddEven.isOdd(5));
        assertEquals(false, OddEven.isOdd(6));}

}
