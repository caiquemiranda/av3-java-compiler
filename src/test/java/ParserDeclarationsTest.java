import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserDeclarationsTest extends ParserTest {

    @Test
    public void decl_varSimples() {
        assertDoesNotThrow(() -> parseOk("int x;"));
    }

    @Test
    public void decl_varInicializada() {
        assertDoesNotThrow(() -> parseOk("double x = 3.5;"));
    }

    @Test
    public void decl_bool() {
        assertDoesNotThrow(() -> parseOk("bool ativo = true;"));
    }

    @Test
    public void decl_invalidaSemPontoEVirgula() {
        assertThrows(Exception.class, () -> parseFail("int x"));
    }

}
