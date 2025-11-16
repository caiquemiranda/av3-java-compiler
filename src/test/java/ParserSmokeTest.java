
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ParserSmokeTest extends ParserTest{

    @Test
    public void smoke_minimo() {
        String code = """
        int x;
        x = 10;
        """;

        assertDoesNotThrow(() -> parseOk(code));
    }
}
