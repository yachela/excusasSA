public class LineaEncargados {
    private final IManejadorExcusa primerEncargado;

    public LineaEncargados(IManejadorExcusa primerEncargado) {
        this.primerEncargado = primerEncargado;
    }

    public IManejadorExcusa getPrimerEncargado() {
        return primerEncargado;
    }
}