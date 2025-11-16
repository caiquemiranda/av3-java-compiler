import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.*;
import com.teoria_computacao.av3.parser.Av3Lexer;
import com.teoria_computacao.av3.parser.Av3Parser;

public class ParserTest {

    private Av3Parser buildParser(String code) {
        Av3Lexer lexer = new Av3Lexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Av3Parser parser = new Av3Parser(tokens);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());

        return parser;
    }

    protected ParseTree parseOk(String code) {
        return buildParser(code).prog();
    }

    protected void parseFail(String code) {
        try {
            buildParser(code).prog();
            throw new AssertionError("Entrada inválida");
        } catch (ParseCancellationException expected) {
        }
    }

}
