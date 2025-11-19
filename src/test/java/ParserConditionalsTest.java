import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserConditionalsTest extends ParserTest{

    @Test
    public void if_simples() {
        assertDoesNotThrow(() ->
                parseOk("int x; if (x) x = 1;")
        );
    }

    @Test
    public void if_else() {
        assertDoesNotThrow(() ->
                parseOk("int x; if (x) x = 1; else x = 2;")
        );
    }

    @Test
    public void if_invalidoSemParenteses() {
        assertThrows(Exception.class, () ->
                parseFail("int x; if x x = 1;")
        );
    }
}
