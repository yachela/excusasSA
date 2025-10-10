
public abstract class Encargado extends Empleado implements IManejadorExcusa{

    protected IManejadorExcusa siguiente;
    private IEstrategiaManejo estrategia;

    public Encargado(String nombre, String email, int legado){
        super(nombre, email, legado);
    }

    public void setEstrategia(IEstrategiaManejo estrategia){
        this.estrategia = estrategia;
    }

    public void setSiguiente(IManejadorExcusa siguiente){
        this.siguiente = siguiente;
    }

    @Override
    public void manejarExcusa(Excusa excusa){
        if(estrategia != null){
            this.estrategia.manejar(this, excusa);
        }
    }

    public IManejadorExcusa getSiguiente(){
        return siguiente;
    }

    protected abstract void procesar(Excusa excusa);
}
