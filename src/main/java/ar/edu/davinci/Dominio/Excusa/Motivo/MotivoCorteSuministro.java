package ar.edu.davinci.Dominio.Excusa.Motivo;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.SupervisorDeArea;

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
