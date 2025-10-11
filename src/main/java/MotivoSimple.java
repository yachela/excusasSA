public class MotivoSimple  implements IMotivo {
    @Override
    public String getJustificacion() {
        return "Motivo trivial como quedarse dormido.";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return false;
    }
}
