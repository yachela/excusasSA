public interface IMotivo {
    String getJustificacion();

    boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa);
}
