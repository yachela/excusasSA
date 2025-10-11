public class SupervisorDeArea extends Encargado {
    private final EmailSender emailSender;
    public SupervisorDeArea(EmailSender emailSender) {
        super("Supervisor", "supervidor@excusas.com", 3000);
        this.emailSender = emailSender;

    }

    @Override
    protected boolean procesar(Excusa excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaTrivial excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) {
        IMotivo motivo = excusa.getMotivo();
        if (motivo instanceof MotivoCorteSuministro) {
            return true;
        } else if (motivo instanceof MotivoCuidadoFamiliar) {
            return true;
        }
        return false;
    }

}
