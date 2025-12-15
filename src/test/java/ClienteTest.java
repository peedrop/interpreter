import org.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Cliente cliente = new Cliente();
        cliente.setProduto1(2.0);
        cliente.setProduto2(5.0);
        cliente.setProduto3(1.0);

        assertEquals(10.0, cliente.calcularTotalCompra());
    }
}
