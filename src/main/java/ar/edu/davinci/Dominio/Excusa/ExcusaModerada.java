package ar.edu.davinci.Dominio.Excusa;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;
import ar.edu.davinci.Manejador.Encargado;

public class ExcusaModerada extends Excusa {
    public ExcusaModerada(IMotivo motivo, Empleado empleado) {
        super(motivo, empleado);
    }

    @Override
    public void procesar() {

    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return encargado.procesar(this);
    }
}
