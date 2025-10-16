import ar.edu.davinci.Services.AdminProntuarios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CEOyAdminProntuariosTest {

    @Test
    void adminProntuariosDebeSerSingleton() {
        AdminProntuarios instancia1 = AdminProntuarios.getInstance();
        AdminProntuarios instancia2 = AdminProntuarios.getInstance();

        assertNotNull(instancia1);
        assertSame(instancia1, instancia2);
    }

    @Test
    void ceoDebeUsarAdminProntuariosAlProcesarExcusaInverosimil() {
    }
}