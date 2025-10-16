package ar.edu.davinci.Dominio.Excusa.Motivo;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.SupervisorDeArea;

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
