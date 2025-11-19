import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserStatementsTest extends ParserTest{

    @Test
    public void assign_simples() {
        assertDoesNotThrow(() -> parseOk("int x; x = 10;"));
    }

    @Test
    public void bloco_vazio() {
        assertDoesNotThrow(() -> parseOk("{}"));
    }

    @Test
    public void bloco_comConteudo() {
        assertDoesNotThrow(() -> parseOk("{ int x; x = 20; }"));
    }
}
