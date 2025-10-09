import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreacionDeExcusasTest {

    @Test
    void creadorDeExcusasTrivialesDebeCrearUnaExcusaTrivialConMotivoSimple(){
        CreadorExcusa creador = new CreadorExcusasTriviales();

        Excusa excusaCreada = creador.CrearExcusa();

        AssertNotNull(excusaCreada);
        assertInstanceOf(ExcusaTrivial.class, excusaCreada);
        assertInstanceOf(MotivoSimple.class, excusaCreada.getMotivo());
    }

}
