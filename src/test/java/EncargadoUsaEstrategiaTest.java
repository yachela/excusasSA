import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    }

    @InjectMocks
    private TestEncargado testEncargado;
}
