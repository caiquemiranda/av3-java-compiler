import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserIOTest extends ParserTest{

    @Test
    public void printf_stringSimples() {
        assertDoesNotThrow(() ->
                parseOk("printf(\"hello\");")
        );
    }

    @Test
    public void printf_comExpressao() {
        assertDoesNotThrow(() ->
                parseOk("int x; printf(x + 1);")
        );
    }

    @Test
    public void scanf_basico() {
        assertDoesNotThrow(() ->
                parseOk("int x; scanf(x);")
        );
    }
}
