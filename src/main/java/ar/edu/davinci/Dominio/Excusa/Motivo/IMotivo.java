package ar.edu.davinci.Dominio.Excusa.Motivo;

import ar.edu.davinci.Dominio.Excusa.Excusa;
import ar.edu.davinci.Manejador.SupervisorDeArea;

public interface IMotivo {
    String getJustificacion();

    boolean serProcesadoPor(SupervisorDeArea supervisor, Excusa excusa);
}
