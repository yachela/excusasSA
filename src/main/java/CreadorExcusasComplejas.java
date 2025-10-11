public class CreadorExcusasComplejas extends CreadorExcusa {
    private final IMotivo motivo;

    public CreadorExcusasComplejas(IMotivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaCompleja(motivo, empleado);
    }
}