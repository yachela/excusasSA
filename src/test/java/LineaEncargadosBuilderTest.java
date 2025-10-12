import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class LineaEncargadosBuilderTest {

    @Test
    void builderDebeConstruirLaCadenaDeMandoEnElOrdenCorrecto() {
        EmailSender mockEmailSender = mock(EmailSender.class);
        BuilderLineaEncargados builder = new BuilderLineaCompleta(mockEmailSender);

        LineaEncargados linea = builder
                .agregarRecepcionista()
                .agregarSupervisor()
                .agregarGerente()
                .agregarCEO()
                .build();

        IManejadorExcusa primerEncargado = linea.getPrimerEncargado();
        assertNotNull(primerEncargado);
        assertInstanceOf(Recepcionista.class, primerEncargado);

        IManejadorExcusa segundoEncargado = ((Encargado) primerEncargado).getSiguiente();
        assertInstanceOf(SupervisorDeArea.class, segundoEncargado);

        IManejadorExcusa tercerEncargado = ((Encargado) segundoEncargado).getSiguiente();
        assertInstanceOf(GerenteDeRRHH.class, tercerEncargado);

        IManejadorExcusa cuartoEncargado = ((Encargado) tercerEncargado).getSiguiente();
        assertInstanceOf(CEO.class, cuartoEncargado);

        assertNull(((Encargado) cuartoEncargado).getSiguiente());
    }
}