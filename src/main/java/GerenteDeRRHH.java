public class GerenteDeRRHH extends Encargado {
    public GerenteDeRRHH() {
        super("Gerente de RRHH", "gerencia.rrhh@excusa.sa", 300);
    }

    @Override
    public boolean procesar(ExcusaTrivial excusa) {
        return false;
    }

    @Override
    public boolean procesarMotivoEspecifico(MotivoCorteSuministro motivoCorteSuministro, Excusa excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaModerada excusa) {
        return false;
    }

    @Override
    protected boolean procesar(Excusa excusa) {
        return false;
    }

    @Override
    public boolean procesar(ExcusaCompleja excusa) {
        System.out.println("Gerente: Aceptando excusa compleja -> " + excusa.getMotivo().getJustificacion());
        return true;
    }
}