package Dominio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JuegoTest {

    @Test
    public void testSumaDados() {
        int dado1 = 3;
        int dado2 = 4;
        int suma = dado1 + dado2;
        assertEquals(7, suma);
    }
}
