package ar.edu.davinci.Dominio.Excusa;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;
import ar.edu.davinci.Manejador.Encargado;

public class ExcusaCompleja extends Excusa {
    public ExcusaCompleja(IMotivo motivo, Empleado empleado) {
        super(motivo, empleado);
    }

    @Override
    public void procesar() {
        System.out.println("Domain.Excusa.Excusa Compleja en proceso");
    }

    @Override
    public boolean serProcesadaPor(Encargado encargado) {
        return encargado.procesar(this);
    }
}
