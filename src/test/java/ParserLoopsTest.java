import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserLoopsTest extends ParserTest{

    @Test
    public void while_basico() {
        assertDoesNotThrow(() ->
                parseOk("int x; while (x) x = x - 1;")
        );
    }

    @Test
    public void doWhile() {
        assertDoesNotThrow(() ->
                parseOk("int x; do x = x - 1; while (x);")
        );
    }

    @Test
    public void for_basico() {
        assertDoesNotThrow(() ->
                parseOk("int x; for (x = 0; x < 10; x = x + 1) x = x;")
        );
    }
}
