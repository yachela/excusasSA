public class Recepcionista extends Encargado {
    private final EmailSender emailSender;

    public Recepcionista(EmailSender emailSender) {
        super("Recepcionista", "recepcion@excusa.sa", 100);
        this.emailSender = emailSender;
    }

    @Override
    public boolean procesar(Excusa excusa) {
            String emailDestino = excusa.getEmpleado().getEmail();
            emailSender.enviarMail(
                    emailDestino,
                    "rrhh@excusa.sa",
                    "motivo demora",
                    "la licencia fue aceptada"
            );
            return true;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) {
        return false;
    }
}