public class MotivoAbduccionAlien implements IMotivo {
    @Override
    public String getJustificacion() {
        return "Fui abducido por aliens.";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return false;
    }
}