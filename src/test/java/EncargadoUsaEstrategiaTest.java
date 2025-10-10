import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EncargadoUsaEstrategiaTest {

    @Mock
    private IEstrategiaManejo mockEstrategia;

    @Mock
    private Excusa mockExcusa;

    static class TestEncargado extends Encargado{
        public TestEncargado() {
            super("Nombre test", "prueba@test.com", 2923);
        }

        @Override
        protected boolean procesar(Excusa excusa) {
            return true;
        }
    }

    @InjectMocks
    private TestEncargado encargado;

    @Test
    void encargadoDebeDelegarElManejoDeSuExtrategia(){
        encargado.setEstrategia(mockEstrategia);

        encargado.manejarExcusa(mockExcusa);

        verify(mockEstrategia).manejar(encargado, mockExcusa);
    }
}
