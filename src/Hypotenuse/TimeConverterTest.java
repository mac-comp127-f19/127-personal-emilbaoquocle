package Hypotenuse;
import org.junit.Test;
import static org.junit.Assert.*;

public class TimeConverterTest {
    @Test
    public void testTime() {assertEquals(3661,TimeConverter.totalSec(1,1,1));}
}
