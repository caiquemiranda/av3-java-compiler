import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserErrorsTest extends ParserTest{

    @Test
    public void erro_faltaPontoVirgula() {
        assertThrows(Exception.class, () -> parseFail("int x"));
    }

    @Test
    public void erro_tokenInesperado() {
        assertThrows(Exception.class, () -> parseFail("int x; x = 10 @ 3;"));
    }

    @Test
    public void erro_blocosSemFechar() {
        assertThrows(Exception.class, () -> parseFail("{ int x; "));
    }
}
