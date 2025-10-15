public class MotivoCorteSuministro implements IMotivo {

    @Override
    public String getJustificacion() {
        return "Me cortaron el agua";
    }

    @Override
    public boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa) {
        return supervisor.procesarMotivoEspecifico(this, excusa);
    }
}
