public class AdminProntuarios {

    private static AdminProntuarios instance;

    private AdminProntuarios() {
        System.out.println("Admin de Prontuarios inicializado.");
    }

    public static AdminProntuarios getInstance() {
        if (instance == null) {
            instance = new AdminProntuarios();
        }
        return instance;
    }

    public void registrarProntuario(ExcusaInverosimil excusa) {
        System.out.println("REGISTRANDO PRONTUARIO para: "
                + excusa.getEmpleado().getNombre()
                + " por motivo: " + excusa.getMotivo().getJustificacion());
    }
}