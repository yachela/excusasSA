public class MotivoCuidadoFamiliar implements IMotivo{
    @Override
    public String getJustificacion() {
        return "Motivo familiar";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return false;
    }
}
