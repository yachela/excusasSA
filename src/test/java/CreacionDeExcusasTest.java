import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreacionDeExcusasTest {

    @Test
    void creadorDeExcusasTrivialesDebeCrearUnaExcusaTrivialConMotivoSimple(){
        CreadorExcusa creador = new CreadorExcusasTriviales();

        Excusa excusaCreada = creador.crearExcusa();

        assertNotNull(excusaCreada);
        assertInstanceOf(ExcusaTrivial.class, excusaCreada);
        assertInstanceOf(MotivoSimple.class, excusaCreada.getMotivo());
    }

}
