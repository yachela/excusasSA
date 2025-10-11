public class MotivoCuidadoFamiliar implements IMotivo{
    @Override
    public String getJustificacion() {
        //TODO mensaje motivo
        return "";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return false;
    }
}
