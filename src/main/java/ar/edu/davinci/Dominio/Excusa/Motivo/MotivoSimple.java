package ar.edu.davinci.Dominio.Excusa.Motivo;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.SupervisorDeArea;

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
