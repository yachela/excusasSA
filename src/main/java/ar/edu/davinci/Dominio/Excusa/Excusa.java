package ar.edu.davinci.Dominio.Excusa;

import ar.edu.davinci.Dominio.Empleado;
import ar.edu.davinci.Dominio.Excusa.Motivo.IMotivo;
import ar.edu.davinci.Manejador.Encargado;

public abstract class Excusa {
    protected IMotivo motivo;
    protected Empleado empleado;

    protected Excusa(IMotivo motivo, Empleado empleado) {
        this.motivo = motivo;
        this.empleado = empleado;
    }

    public IMotivo getMotivo() {
        return motivo;
    }

    public abstract void procesar();

    public Empleado getEmpleado() {
        return empleado;
    }

    public abstract boolean serProcesadaPor(Encargado encargado);
}
