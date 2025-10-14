public class CEO extends Encargado implements Observador{
    private final EmailSender emailSender;

    public CEO(EmailSender emailSender) {
        super("CEO", "ceo@excusa.sa", 1);
        this.emailSender = emailSender;
    }

    @Override
    public boolean procesar(ExcusaTrivial excusa) { return false; }

    @Override
    public boolean procesarMotivoEspecifico(MotivoCorteSuministro motivoCorteSuministro, Excusa excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) { return false; }

    @Override
    public boolean procesar(ExcusaCompleja excusa) { return false; }

    @Override
    public boolean procesar(ExcusaInverosimil excusa) {
        AdminProntuarios.getInstance().registrarProntuario(excusa);
        emailSender.enviarMail(
                excusa.getEmpleado().getEmail(), this.getEmail(), "Resolución de excusa", "Aprobado por creatividad");

        SistemaDeNotificacionesCEO.getInstance().nuevoProntuarioRegistrado(this, excusa);

        return true;
    }

    @Override
    public void notificar(CEO ceoOriginador, Excusa excusa) {
        String cuerpo = "Notificación: El CEO relevo un nuevo prontuario.";

        emailSender.enviarMail(this.getEmail(), "sistema.alertas@excusa.sa", "Nuevo Prontuario", cuerpo);
    }

    @Override
    public void agregarObservador(Observador o) {

    }

    @Override
    public void sacarObservador(Observador o) {

    }

    @Override
    public void notificarObservadores(Excusa excusa) {

    }
}
