import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreacionDeExcusasTest {

    @Test
    void creadorDeExcusasTrivialesDebeCrearUnaExcusaTrivialConMotivoSimple(){
        CreadorExcusa creador = new CreadorExcusasTriviales();
        Empleado empleado = new Empleado("test", "test@test.com", 123);

        Excusa excusaCreada = creador.crearExcusa(empleado);

        assertNotNull(excusaCreada);
        assertInstanceOf(ExcusaTrivial.class, excusaCreada);
        assertInstanceOf(MotivoSimple.class, excusaCreada.getMotivo());
    }

}
