public class CreadorExcusasModeradas extends CreadorExcusa {
    private final IMotivo motivo;
    public CreadorExcusasModeradas(IMotivo motivo) { this.motivo = motivo; }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaModerada(motivo, empleado);
    }
}