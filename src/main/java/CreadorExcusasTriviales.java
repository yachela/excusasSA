public class CreadorExcusasTriviales extends CreadorExcusa {
    @Override
    public Excusa crearExcusa(Empleado empleado) {
        return new ExcusaTrivial(new MotivoSimple(), empleado);
    }
}
