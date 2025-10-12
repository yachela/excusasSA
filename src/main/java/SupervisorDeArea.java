public class SupervisorDeArea extends Encargado {
    private final EmailSender emailSender;
    public SupervisorDeArea(EmailSender emailSender) {
        super("Supervisor", "supervisor.area@excusa.sa", 3000);
        this.emailSender = emailSender;
    }

    @Override
    public boolean procesar(ExcusaTrivial excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) {
        return excusa.getMotivo().serProcesadoPor(this, excusa);
    }

    public boolean procesarMotivoEspecifico(MotivoCorteSuministro motivo, Excusa excusa) {
        String cuerpo = String.format("Consulta por el empleado %s, legajo %d",
                excusa.getEmpleado().getNombre(), excusa.getEmpleado().getLegajo());
        emailSender.enviarMail("EDESUR@mailfake.com.ar", this.getEmail(), "Consulta por corte de suministro", cuerpo);
        return true;
    }

    public boolean procesarMotivoEspecifico(MotivoCuidadoFamiliar motivo, Excusa excusa) {
        String cuerpo = String.format("Hola %s, esperamos que todo esté bien. Saludos.",
                excusa.getEmpleado().getNombre());
        emailSender.enviarMail(excusa.getEmpleado().getEmail(), this.getEmail(), "Consulta sobre tu situación", cuerpo);
        return true;
    }

    @Override
    public boolean procesar(ExcusaCompleja excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaInverosimil excusa) {
        return false;
    }
}
