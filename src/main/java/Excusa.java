public abstract class Excusa {
    protected IMotivo motivo;

    protected Excusa(IMotivo motivo) {
        this.motivo = motivo;
    }

    public IMotivo getMotivo() {
        return motivo;
    }

    public abstract void procesar();

}
