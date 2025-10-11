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
