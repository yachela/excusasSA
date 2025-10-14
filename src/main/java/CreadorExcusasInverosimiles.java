public class CreadorExcusasInverosimiles extends CreadorExcusa{
    private IMotivo motivo;

    public CreadorExcusasInverosimiles(IMotivo motivo) {
        this.motivo = motivo;
    }

    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaInverosimil(this.motivo, empleado);
    }
}
