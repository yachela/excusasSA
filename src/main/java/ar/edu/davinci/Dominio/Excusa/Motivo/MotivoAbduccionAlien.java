package ar.edu.davinci.Dominio.Excusa.Motivo;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.SupervisorDeArea;

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