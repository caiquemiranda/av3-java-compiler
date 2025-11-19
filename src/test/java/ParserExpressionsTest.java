import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserExpressionsTest extends ParserTest{

    @Test
    public void expr_aritmeticaBasica() {
        assertDoesNotThrow(() -> parseOk("int x; x = 1 + 2 * 3;"));
    }

    @Test
    public void expr_relacional() {
        assertDoesNotThrow(() -> parseOk("int x; x = 5 < 10;"));
    }

    @Test
    public void expr_logica() {
        assertDoesNotThrow(() -> parseOk("int x; x = true && false;"));
    }

    @Test
    public void expr_parenteses() {
        assertDoesNotThrow(() -> parseOk("int x; x = (1 + (2 * 3));"));
    }
}
