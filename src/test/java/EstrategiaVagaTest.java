import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EstrategiaVagaTest {

    @Mock
    private Encargado mockEncargado;
    @Mock
    private IManejadorExcusa mockSiguiente;
    @Mock
    private Excusa mockExcusa;

    @Test
    void estrategiaVagaDebePasarLaExcusaAlSiguienteEncargado(){
        when(mockEncargado.getSiguiente()).thenReturn(mockSiguiente);
        EstrategiaVaga estrategia = new EstrategiaVaga();

        estrategia.manejar(mockEncargado, mockExcusa);

        verify(mockSiguiente).manejarExcusa(mockExcusa);
    }
}
