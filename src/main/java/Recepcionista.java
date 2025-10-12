public class Recepcionista extends Encargado {
    private final EmailSender emailSender;

    public Recepcionista(EmailSender emailSender) {
        super("Recepcionista", "recepcion@excusa.sa", 100);
        this.emailSender = emailSender;
    }

    @Override
    public boolean procesar(ExcusaTrivial excusa) {
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
    public boolean procesarMotivoEspecifico(MotivoCorteSuministro motivoCorteSuministro, Excusa excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaCompleja excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaInverosimil excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) {
        return false;
    }
}