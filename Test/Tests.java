import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static xkorpion.Main.*;

public class Tests {
    @Test
    public void test(){
        assertEquals(recursive(2,64, 1, 0), 6);
    }
}
