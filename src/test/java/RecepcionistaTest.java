import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class RecepcionistaTest {

    @Mock
    private EmailSender mockEmailSender;

    @InjectMocks
    private Recepcionista recepcionista;

    @Test
    void debeProcesarYRetornarTrueParaExcusasTriviales() {
        Empleado empleado = new Empleado("Juan Perez", "juan.perez@example.com", 456);
        CreadorExcusa creador = new CreadorExcusasTriviales();
        Excusa excusaTrivial = creador.crearExcusa(empleado);

        boolean resultado = recepcionista.procesar(excusaTrivial);

        assertTrue(resultado);
        verify(mockEmailSender).enviarMail(
                "juan.perez@example.com",
                null,
                "motivo demora",
                "la licencia fue aceptada"
        );
    }
}