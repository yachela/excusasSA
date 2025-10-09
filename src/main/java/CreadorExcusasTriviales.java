public class CreadorExcusasTriviales extends CreadorExcusa {
    @Override
    public Excusa crearExcusa() {
        IMotivo motivo = new MotivoSimple();
        return  new ExcusaTrivial(motivo);
    }
}
