import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SupervisorDeAreaTest {

    @Mock
    private EmailSender mockEmailSender;

    @InjectMocks
    private SupervisorDeArea supervisor;

    @Test
    void debeProcesarCorteDeSuministroYEnviarEmailAVerificacion() {
        Empleado empleado = new Empleado("Ana Gomez", "ana.gomez@example.com", 789);
        CreadorExcusa creador = new CreadorExcusasModeradas(new MotivoCorteSuministro());
        Excusa excusaModerada = creador.crearExcusa(empleado);

        boolean resultado = supervisor.procesar(excusaModerada);

        assertTrue(resultado);
        verify(mockEmailSender).enviarMail(
                "EDESUR@mailfake.com.ar",
                "supervisor.area@excusa.sa",
                "Consulta por corte de suministro",
                "Consulta por el empleado Ana Gomez, legajo 789"
        );
    }
}