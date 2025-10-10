import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EstrategiaNormalTest {

    @Mock
    private Encargado mockEncargado;

    @Mock
    private IManejadorExcusa mockSiguiente;

    @Mock
    private Excusa mockExcusa;

    @Test
    void manejarDebeLlamarAProcesarDelEncargado() {

        when(mockEncargado.procesar(mockExcusa)).thenReturn(true);
        EstrategiaNormal estrategia = new EstrategiaNormal();

        estrategia.manejar(mockEncargado, mockExcusa);

        verify(mockEncargado).procesar(mockExcusa);
        verify(mockEncargado, never()).getSiguiente();
    }

    @Test
    void manejarDebePasarAlSiguienteSiEncargadoNoPuedeProcesar() {
        when(mockEncargado.procesar(mockExcusa)).thenReturn(false);
        when(mockEncargado.getSiguiente()).thenReturn(mockSiguiente);
        EstrategiaNormal estrategia = new EstrategiaNormal();
        estrategia.manejar(mockEncargado, mockExcusa);
        verify(mockEncargado).procesar(mockExcusa);

    }
}
