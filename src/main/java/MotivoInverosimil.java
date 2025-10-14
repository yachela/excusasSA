public class MotivoInverosimil implements IMotivo {

    @Override
    public String getJustificacion() {
        return "";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return false;
    }
}
