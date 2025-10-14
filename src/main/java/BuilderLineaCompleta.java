public class BuilderLineaCompleta implements BuilderLineaEncargados {
    private IManejadorExcusa primerEncargado;
    private IManejadorExcusa ultimoEncargado;
    private final EmailSender emailSender;

    public BuilderLineaCompleta(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    private void agregarEslabon(IManejadorExcusa nuevoEslabon) {
        if (this.primerEncargado == null) {
            this.primerEncargado = nuevoEslabon;
            this.ultimoEncargado = nuevoEslabon;
        } else {
            this.ultimoEncargado.setSiguiente(nuevoEslabon);
            this.ultimoEncargado = nuevoEslabon;
        }
    }

    @Override
    public BuilderLineaEncargados agregarRecepcionista() {
        agregarEslabon(new Recepcionista(emailSender));
        return this;
    }

    @Override
    public BuilderLineaEncargados agregarSupervisor() {
        agregarEslabon(new SupervisorDeArea(emailSender));
        return this;
    }

    @Override
    public BuilderLineaEncargados agregarGerente() {
        agregarEslabon(new GerenteDeRRHH());
        return this;
    }

    @Override
    public BuilderLineaEncargados agregarCEO() {
        agregarEslabon(new CEO(emailSender));
        return this;
    }

    @Override
    public LineaEncargados build() {
        return new LineaEncargados(this.primerEncargado);
    }
}